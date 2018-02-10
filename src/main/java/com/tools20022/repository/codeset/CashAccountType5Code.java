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
import com.tools20022.repository.codeset.CashAccountType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType5Code#Lending
 * CashAccountType5Code.Lending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType5Code#Collateral
 * CashAccountType5Code.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType5Code#FinancialSettlement
 * CashAccountType5Code.FinancialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType5Code#MarginReturn
 * CashAccountType5Code.MarginReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType5Code#Segregated
 * CashAccountType5Code.Segregated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
 * CashAccountTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of cash account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashAccountType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType5Code
	 * CashAccountType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lending"</li>
	 * </ul>
	 */
	public static final CashAccountType5Code Lending = new CashAccountType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lending";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType5Code.mmObject();
			codeName = CashAccountTypeCode.Lending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType5Code
	 * CashAccountType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * </ul>
	 */
	public static final CashAccountType5Code Collateral = new CashAccountType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType5Code.mmObject();
			codeName = CashAccountTypeCode.Collateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType5Code
	 * CashAccountType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialSettlement"</li>
	 * </ul>
	 */
	public static final CashAccountType5Code FinancialSettlement = new CashAccountType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType5Code.mmObject();
			codeName = CashAccountTypeCode.FinancialSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType5Code
	 * CashAccountType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginReturn"</li>
	 * </ul>
	 */
	public static final CashAccountType5Code MarginReturn = new CashAccountType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginReturn";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType5Code.mmObject();
			codeName = CashAccountTypeCode.MarginReturn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType5Code
	 * CashAccountType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Segregated"</li>
	 * </ul>
	 */
	public static final CashAccountType5Code Segregated = new CashAccountType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Segregated";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType5Code.mmObject();
			codeName = CashAccountTypeCode.Segregated.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CashAccountType5Code> codesByName = new LinkedHashMap<>();

	protected CashAccountType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountType5Code";
				definition = "Specifies the type of cash account.";
				trace_lazy = () -> CashAccountTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashAccountType5Code.Lending, com.tools20022.repository.codeset.CashAccountType5Code.Collateral,
						com.tools20022.repository.codeset.CashAccountType5Code.FinancialSettlement, com.tools20022.repository.codeset.CashAccountType5Code.MarginReturn, com.tools20022.repository.codeset.CashAccountType5Code.Segregated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Lending.getCodeName().get(), Lending);
		codesByName.put(Collateral.getCodeName().get(), Collateral);
		codesByName.put(FinancialSettlement.getCodeName().get(), FinancialSettlement);
		codesByName.put(MarginReturn.getCodeName().get(), MarginReturn);
		codesByName.put(Segregated.getCodeName().get(), Segregated);
	}

	public static CashAccountType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashAccountType5Code[] values() {
		CashAccountType5Code[] values = new CashAccountType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashAccountType5Code> {
		@Override
		public CashAccountType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashAccountType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}