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
import com.tools20022.repository.codeset.InvestmentAccountCategory1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the investment account category.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategory1Code#MandateAccount
 * InvestmentAccountCategory1Code.MandateAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategory1Code#RetailAccount
 * InvestmentAccountCategory1Code.RetailAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategoryCode
 * InvestmentAccountCategoryCode}</li>
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
 * "InvestmentAccountCategory1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the investment account category."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentAccountCategory1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategory1Code
	 * InvestmentAccountCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateAccount"</li>
	 * </ul>
	 */
	public static final InvestmentAccountCategory1Code MandateAccount = new InvestmentAccountCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentAccountCategory1Code.mmObject();
			codeName = InvestmentAccountCategoryCode.MandateAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategory1Code
	 * InvestmentAccountCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailAccount"</li>
	 * </ul>
	 */
	public static final InvestmentAccountCategory1Code RetailAccount = new InvestmentAccountCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentAccountCategory1Code.mmObject();
			codeName = InvestmentAccountCategoryCode.RetailAccount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestmentAccountCategory1Code> codesByName = new LinkedHashMap<>();

	protected InvestmentAccountCategory1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountCategory1Code";
				definition = "Specifies the investment account category.";
				trace_lazy = () -> InvestmentAccountCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentAccountCategory1Code.MandateAccount, com.tools20022.repository.codeset.InvestmentAccountCategory1Code.RetailAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MandateAccount.getCodeName().get(), MandateAccount);
		codesByName.put(RetailAccount.getCodeName().get(), RetailAccount);
	}

	public static InvestmentAccountCategory1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentAccountCategory1Code[] values() {
		InvestmentAccountCategory1Code[] values = new InvestmentAccountCategory1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentAccountCategory1Code> {
		@Override
		public InvestmentAccountCategory1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentAccountCategory1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}