package net.royqh.easypersist.ui.editor;

public enum ViewType {
    ExcelStyleEditorOnly {
        @Override
        public String getName() {
            return "仿Excel编辑视图";
        }

        @Override
        public boolean containsFullFunctionEditor() {
            return false;
        }

        @Override
        public boolean containsSearchView() {
            return false;
        }

        @Override
        public boolean containsExcelStyleEditor() {
            return true;
        }
    },
    FullFunctionEditorOnly {
        @Override
        public String getName() {
            return "全功能编辑视图（带搜索功能）";
        }

        @Override
        public boolean containsFullFunctionEditor() {
            return true;
        }

        @Override
        public boolean containsSearchView() {
            return false;
        }

        @Override
        public boolean containsExcelStyleEditor() {
            return false;
        }
    },
    FactTableEditorOnly {
        @Override
        public String getName() {
            return "事实表编辑视图";
        }

        @Override
        public boolean containsFullFunctionEditor() {
            return false;
        }

        @Override
        public boolean containsSearchView() {
            return false;
        }

        @Override
        public boolean containsExcelStyleEditor() {
            return false;
        }
    },
    SearchViewOnly {
        @Override
        public String getName() {
            return "搜索和察看视图";
        }

        @Override
        public boolean containsFullFunctionEditor() {
            return false;
        }

        @Override
        public boolean containsSearchView() {
            return true;
        }

        @Override
        public boolean containsExcelStyleEditor() {
            return false;
        }
    },
    ExcelStyleEditorAndSearchView {
        @Override
        public String getName() {
            return "搜索和察看视图、仿Excel编辑视图";
        }

        @Override
        public boolean containsFullFunctionEditor() {
            return false;
        }

        @Override
        public boolean containsSearchView() {
            return true;
        }

        @Override
        public boolean containsExcelStyleEditor() {
            return true;
        }
    },
    FullFunctionEdtiorAndSearchView {
        @Override
        public String getName() {
            return "搜索和察看视图、全功能编辑视图";
        }

        @Override
        public boolean containsFullFunctionEditor() {
            return true;
        }

        @Override
        public boolean containsSearchView() {
            return true;
        }

        @Override
        public boolean containsExcelStyleEditor() {
            return false;
        }
    };
    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }

    public abstract boolean containsFullFunctionEditor();
    public abstract boolean containsSearchView();
    public abstract boolean containsExcelStyleEditor();
}
