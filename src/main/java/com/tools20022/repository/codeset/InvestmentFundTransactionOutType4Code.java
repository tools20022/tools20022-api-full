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
import com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of investment fund transaction that results in a cash
 * movement out of a fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code#Redemption
 * InvestmentFundTransactionOutType4Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code#SwitchOut
 * InvestmentFundTransactionOutType4Code.SwitchOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code#InSpecie
 * InvestmentFundTransactionOutType4Code.InSpecie}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code#CrossOut
 * InvestmentFundTransactionOutType4Code.CrossOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code#Dividend
 * InvestmentFundTransactionOutType4Code.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code#Other
 * InvestmentFundTransactionOutType4Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
 * InvestmentFundTransactionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REDM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundTransactionOutType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of investment fund transaction that results in a cash movement out of a fund."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundTransactionOutType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code
	 * InvestmentFundTransactionOutType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionOutType4Code Redemption = new InvestmentFundTransactionOutType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code
	 * InvestmentFundTransactionOutType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchOut"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionOutType4Code SwitchOut = new InvestmentFundTransactionOutType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOut";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SwitchOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code
	 * InvestmentFundTransactionOutType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InSpecie"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionOutType4Code InSpecie = new InvestmentFundTransactionOutType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InSpecie";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.InSpecie.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code
	 * InvestmentFundTransactionOutType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossOut"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionOutType4Code CrossOut = new InvestmentFundTransactionOutType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossOut";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.CrossOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code
	 * InvestmentFundTransactionOutType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionOutType4Code Dividend = new InvestmentFundTransactionOutType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Dividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code
	 * InvestmentFundTransactionOutType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionOutType4Code Other = new InvestmentFundTransactionOutType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestmentFundTransactionOutType4Code> codesByName = new LinkedHashMap<>();

	protected InvestmentFundTransactionOutType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REDM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransactionOutType4Code";
				definition = "Specifies the type of investment fund transaction that results in a cash movement out of a fund.";
				trace_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.Redemption, com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.SwitchOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.InSpecie, com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.CrossOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.Dividend, com.tools20022.repository.codeset.InvestmentFundTransactionOutType4Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(SwitchOut.getCodeName().get(), SwitchOut);
		codesByName.put(InSpecie.getCodeName().get(), InSpecie);
		codesByName.put(CrossOut.getCodeName().get(), CrossOut);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static InvestmentFundTransactionOutType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundTransactionOutType4Code[] values() {
		InvestmentFundTransactionOutType4Code[] values = new InvestmentFundTransactionOutType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundTransactionOutType4Code> {
		@Override
		public InvestmentFundTransactionOutType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundTransactionOutType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}