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
import com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the contract type of a derivate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#ContractForDifference
 * FinancialInstrumentContractType1Code.ContractForDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#Forward
 * FinancialInstrumentContractType1Code.Forward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#ForwardRateAgreement
 * FinancialInstrumentContractType1Code.ForwardRateAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#Futures
 * FinancialInstrumentContractType1Code.Futures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#Option
 * FinancialInstrumentContractType1Code.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#Other
 * FinancialInstrumentContractType1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#SpreadBetting
 * FinancialInstrumentContractType1Code.SpreadBetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#Swap
 * FinancialInstrumentContractType1Code.Swap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#Swaption
 * FinancialInstrumentContractType1Code.Swaption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#FuturesOnSwap
 * FinancialInstrumentContractType1Code.FuturesOnSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#PortfolioSwap
 * FinancialInstrumentContractType1Code.PortfolioSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#ForwardFreightAgreement
 * FinancialInstrumentContractType1Code.ForwardFreightAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code#ForwardsOnASwap
 * FinancialInstrumentContractType1Code.ForwardsOnASwap}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
 * FinancialInstrumentContractTypeCode}</li>
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
 * "FinancialInstrumentContractType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the contract type of a derivate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialInstrumentContractType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractForDifference"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code ContractForDifference = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractForDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.ContractForDifference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forward"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code Forward = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forward";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.Forward.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardRateAgreement"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code ForwardRateAgreement = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardRateAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.ForwardRateAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code Futures = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.Futures.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code Option = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.Option.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code Other = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadBetting"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code SpreadBetting = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadBetting";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.SpreadBetting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code Swap = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.Swap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swaption"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code Swaption = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaption";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.Swaption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FuturesOnSwap"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code FuturesOnSwap = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FuturesOnSwap";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.FuturesOnSwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioSwap"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code PortfolioSwap = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioSwap";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.PortfolioSwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardFreightAgreement"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code ForwardFreightAgreement = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardFreightAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.ForwardFreightAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardsOnASwap"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractType1Code ForwardsOnASwap = new FinancialInstrumentContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardsOnASwap";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.mmObject();
			codeName = FinancialInstrumentContractTypeCode.ForwardsOnASwap.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FinancialInstrumentContractType1Code> codesByName = new LinkedHashMap<>();

	protected FinancialInstrumentContractType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentContractType1Code";
				definition = "Specifies the contract type of a derivate.";
				trace_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.ContractForDifference, com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.Forward,
						com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.ForwardRateAgreement, com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.Futures,
						com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.Option, com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.Other,
						com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.SpreadBetting, com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.Swap,
						com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.Swaption, com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.FuturesOnSwap,
						com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.PortfolioSwap, com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.ForwardFreightAgreement,
						com.tools20022.repository.codeset.FinancialInstrumentContractType1Code.ForwardsOnASwap);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ContractForDifference.getCodeName().get(), ContractForDifference);
		codesByName.put(Forward.getCodeName().get(), Forward);
		codesByName.put(ForwardRateAgreement.getCodeName().get(), ForwardRateAgreement);
		codesByName.put(Futures.getCodeName().get(), Futures);
		codesByName.put(Option.getCodeName().get(), Option);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(SpreadBetting.getCodeName().get(), SpreadBetting);
		codesByName.put(Swap.getCodeName().get(), Swap);
		codesByName.put(Swaption.getCodeName().get(), Swaption);
		codesByName.put(FuturesOnSwap.getCodeName().get(), FuturesOnSwap);
		codesByName.put(PortfolioSwap.getCodeName().get(), PortfolioSwap);
		codesByName.put(ForwardFreightAgreement.getCodeName().get(), ForwardFreightAgreement);
		codesByName.put(ForwardsOnASwap.getCodeName().get(), ForwardsOnASwap);
	}

	public static FinancialInstrumentContractType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialInstrumentContractType1Code[] values() {
		FinancialInstrumentContractType1Code[] values = new FinancialInstrumentContractType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialInstrumentContractType1Code> {
		@Override
		public FinancialInstrumentContractType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialInstrumentContractType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}