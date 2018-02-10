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
import com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of investment fund transaction that results in a cash
 * movement into a fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code#Subscription
 * InvestmentFundTransactionInType1Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code#SwitchIn
 * InvestmentFundTransactionInType1Code.SwitchIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code#InSpecie
 * InvestmentFundTransactionInType1Code.InSpecie}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code#CrossIn
 * InvestmentFundTransactionInType1Code.CrossIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code#ReinvestmentOfDividend
 * InvestmentFundTransactionInType1Code.ReinvestmentOfDividend}</li>
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
 * <li>"SUBS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundTransactionInType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of investment fund transaction that results in a cash movement into a fund."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundTransactionInType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code
	 * InvestmentFundTransactionInType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionInType1Code Subscription = new InvestmentFundTransactionInType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code
	 * InvestmentFundTransactionInType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchIn"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionInType1Code SwitchIn = new InvestmentFundTransactionInType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchIn";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SwitchIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code
	 * InvestmentFundTransactionInType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InSpecie"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionInType1Code InSpecie = new InvestmentFundTransactionInType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InSpecie";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.InSpecie.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code
	 * InvestmentFundTransactionInType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossIn"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionInType1Code CrossIn = new InvestmentFundTransactionInType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossIn";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.CrossIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code
	 * InvestmentFundTransactionInType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentOfDividend"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionInType1Code ReinvestmentOfDividend = new InvestmentFundTransactionInType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentOfDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.ReinvestmentOfDividend.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestmentFundTransactionInType1Code> codesByName = new LinkedHashMap<>();

	protected InvestmentFundTransactionInType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SUBS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransactionInType1Code";
				definition = "Specifies the type of investment fund transaction that results in a cash movement into a fund.";
				trace_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.Subscription, com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.SwitchIn,
						com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.InSpecie, com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.CrossIn,
						com.tools20022.repository.codeset.InvestmentFundTransactionInType1Code.ReinvestmentOfDividend);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(SwitchIn.getCodeName().get(), SwitchIn);
		codesByName.put(InSpecie.getCodeName().get(), InSpecie);
		codesByName.put(CrossIn.getCodeName().get(), CrossIn);
		codesByName.put(ReinvestmentOfDividend.getCodeName().get(), ReinvestmentOfDividend);
	}

	public static InvestmentFundTransactionInType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundTransactionInType1Code[] values() {
		InvestmentFundTransactionInType1Code[] values = new InvestmentFundTransactionInType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundTransactionInType1Code> {
		@Override
		public InvestmentFundTransactionInType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundTransactionInType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}