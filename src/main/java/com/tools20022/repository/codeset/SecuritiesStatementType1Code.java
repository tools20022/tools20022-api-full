/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SecuritiesStatementType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the statement is an accounting or a custody statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesStatementType1Code#Custody
 * SecuritiesStatementType1Code.Custody}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesStatementType1Code#Accounting
 * SecuritiesStatementType1Code.Accounting}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesStatementTypeCode
 * SecuritiesStatementTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CUST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesStatementType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the statement is an accounting or a custody statement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesStatementType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesStatementType1Code
	 * SecuritiesStatementType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custody"</li>
	 * </ul>
	 */
	public static final SecuritiesStatementType1Code Custody = new SecuritiesStatementType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custody";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesStatementType1Code.mmObject();
			codeName = SecuritiesStatementTypeCode.Custody.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesStatementType1Code
	 * SecuritiesStatementType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accounting"</li>
	 * </ul>
	 */
	public static final SecuritiesStatementType1Code Accounting = new SecuritiesStatementType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accounting";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesStatementType1Code.mmObject();
			codeName = SecuritiesStatementTypeCode.Accounting.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesStatementType1Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesStatementType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CUST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesStatementType1Code";
				definition = "Specifies whether the statement is an accounting or a custody statement.";
				trace_lazy = () -> SecuritiesStatementTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesStatementType1Code.Custody, com.tools20022.repository.codeset.SecuritiesStatementType1Code.Accounting);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Custody.getCodeName().get(), Custody);
		codesByName.put(Accounting.getCodeName().get(), Accounting);
	}

	public static SecuritiesStatementType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesStatementType1Code[] values() {
		SecuritiesStatementType1Code[] values = new SecuritiesStatementType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesStatementType1Code> {
		@Override
		public SecuritiesStatementType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesStatementType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}