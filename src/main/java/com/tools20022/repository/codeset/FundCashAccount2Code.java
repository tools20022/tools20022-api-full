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
import com.tools20022.repository.codeset.FundCashAccount2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the cash account type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount2Code#CashAccount
 * FundCashAccount2Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount2Code#PensionFundOrdinary
 * FundCashAccount2Code.PensionFundOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount2Code#PensionFundSpecial
 * FundCashAccount2Code.PensionFundSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount2Code#RetirementScheme
 * FundCashAccount2Code.RetirementScheme}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
 * FundCashAccountCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundCashAccount2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash account type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundCashAccount2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount2Code
	 * FundCashAccount2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * </ul>
	 */
	public static final FundCashAccount2Code CashAccount = new FundCashAccount2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount2Code.mmObject();
			codeName = FundCashAccountCode.CashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount2Code
	 * FundCashAccount2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionFundOrdinary"</li>
	 * </ul>
	 */
	public static final FundCashAccount2Code PensionFundOrdinary = new FundCashAccount2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionFundOrdinary";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount2Code.mmObject();
			codeName = FundCashAccountCode.PensionFundOrdinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount2Code
	 * FundCashAccount2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionFundSpecial"</li>
	 * </ul>
	 */
	public static final FundCashAccount2Code PensionFundSpecial = new FundCashAccount2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionFundSpecial";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount2Code.mmObject();
			codeName = FundCashAccountCode.PensionFundSpecial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount2Code
	 * FundCashAccount2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetirementScheme"</li>
	 * </ul>
	 */
	public static final FundCashAccount2Code RetirementScheme = new FundCashAccount2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementScheme";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount2Code.mmObject();
			codeName = FundCashAccountCode.RetirementScheme.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FundCashAccount2Code> codesByName = new LinkedHashMap<>();

	protected FundCashAccount2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundCashAccount2Code";
				definition = "Specifies the cash account type.";
				trace_lazy = () -> FundCashAccountCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundCashAccount2Code.CashAccount, com.tools20022.repository.codeset.FundCashAccount2Code.PensionFundOrdinary,
						com.tools20022.repository.codeset.FundCashAccount2Code.PensionFundSpecial, com.tools20022.repository.codeset.FundCashAccount2Code.RetirementScheme);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(PensionFundOrdinary.getCodeName().get(), PensionFundOrdinary);
		codesByName.put(PensionFundSpecial.getCodeName().get(), PensionFundSpecial);
		codesByName.put(RetirementScheme.getCodeName().get(), RetirementScheme);
	}

	public static FundCashAccount2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundCashAccount2Code[] values() {
		FundCashAccount2Code[] values = new FundCashAccount2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundCashAccount2Code> {
		@Override
		public FundCashAccount2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundCashAccount2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}