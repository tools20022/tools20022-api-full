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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the contract type of a derivate financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
 * FinancialInstrumentContractType1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmContractForDifference
 * FinancialInstrumentContractTypeCode.mmContractForDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmForwardRateAgreement
 * FinancialInstrumentContractTypeCode.mmForwardRateAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmFutures
 * FinancialInstrumentContractTypeCode.mmFutures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmForward
 * FinancialInstrumentContractTypeCode.mmForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmOption
 * FinancialInstrumentContractTypeCode.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmSwap
 * FinancialInstrumentContractTypeCode.mmSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmSpreadBetting
 * FinancialInstrumentContractTypeCode.mmSpreadBetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmSwaption
 * FinancialInstrumentContractTypeCode.mmSwaption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmOther
 * FinancialInstrumentContractTypeCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmFuturesOnSwap
 * FinancialInstrumentContractTypeCode.mmFuturesOnSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmPortfolioSwap
 * FinancialInstrumentContractTypeCode.mmPortfolioSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmForwardsOnASwap
 * FinancialInstrumentContractTypeCode.mmForwardsOnASwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#mmForwardFreightAgreement
 * FinancialInstrumentContractTypeCode.mmForwardFreightAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentContractTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the contract type of a derivate financial instrument."</li>
 * </ul>
 */
public class FinancialInstrumentContractTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Contract of type contracts for difference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractForDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type contracts for difference."</li>
	 * </ul>
	 */
	public static final MMCode mmContractForDifference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractForDifference";
			definition = "Contract of type contracts for difference.";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "CFDS";
		}
	};
	/**
	 * Contract of type forward rate agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardRateAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type forward rate agreement."</li>
	 * </ul>
	 */
	public static final MMCode mmForwardRateAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardRateAgreement";
			definition = "Contract of type forward rate agreement.";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "FRAS";
		}
	};
	/**
	 * Contract of type future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type future."</li>
	 * </ul>
	 */
	public static final MMCode mmFutures = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Contract of type future.";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * Contract of type forward.<br>
	 * <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type forward.\r\n\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmForward = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forward";
			definition = "Contract of type forward.\r\n\r\n";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "FORW";
		}
	};
	/**
	 * Contract of type option.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type option.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Contract of type option.\r\n";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * Contract of type swap.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type swap.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmSwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			definition = "Contract of type swap.\r\n";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * Contract of type spread betting.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadBetting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type spread betting.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmSpreadBetting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadBetting";
			definition = "Contract of type spread betting.\r\n";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "SPDB";
		}
	};
	/**
	 * Contract of type swaption.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swaption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type swaption.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmSwaption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaption";
			definition = "Contract of type swaption.\r\n";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "SWPT";
		}
	};
	/**
	 * Contract of other financial instrument contract type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of other financial instrument contract type. "</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Contract of other financial instrument contract type. ";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Contract of type future on a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FONS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FuturesOnSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type future on a swap."</li>
	 * </ul>
	 */
	public static final MMCode mmFuturesOnSwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FuturesOnSwap";
			definition = "Contract of type future on a swap.";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "FONS";
		}
	};
	/**
	 * Contract of type portfolio swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSWP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type portfolio swap."</li>
	 * </ul>
	 */
	public static final MMCode mmPortfolioSwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioSwap";
			definition = "Contract of type portfolio swap.";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "PSWP";
		}
	};
	/**
	 * Contract of type forwards on a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FWOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardsOnASwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type forwards on a swap."</li>
	 * </ul>
	 */
	public static final MMCode mmForwardsOnASwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardsOnASwap";
			definition = "Contract of type forwards on a swap.";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "FWOS";
		}
	};
	/**
	 * Contract of type forward freight agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode
	 * FinancialInstrumentContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FFAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardFreightAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract of type forward freight agreement."</li>
	 * </ul>
	 */
	public static final MMCode mmForwardFreightAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardFreightAgreement";
			definition = "Contract of type forward freight agreement.";
			owner_lazy = () -> FinancialInstrumentContractTypeCode.mmObject();
			codeName = "FFAS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentContractTypeCode";
				definition = "Specifies the contract type of a derivate financial instrument.";
				code_lazy = () -> Arrays.asList(FinancialInstrumentContractTypeCode.mmContractForDifference, FinancialInstrumentContractTypeCode.mmForwardRateAgreement, FinancialInstrumentContractTypeCode.mmFutures,
						FinancialInstrumentContractTypeCode.mmForward, FinancialInstrumentContractTypeCode.mmOption, FinancialInstrumentContractTypeCode.mmSwap, FinancialInstrumentContractTypeCode.mmSpreadBetting,
						FinancialInstrumentContractTypeCode.mmSwaption, FinancialInstrumentContractTypeCode.mmOther, FinancialInstrumentContractTypeCode.mmFuturesOnSwap, FinancialInstrumentContractTypeCode.mmPortfolioSwap,
						FinancialInstrumentContractTypeCode.mmForwardsOnASwap, FinancialInstrumentContractTypeCode.mmForwardFreightAgreement);
				derivation_lazy = () -> Arrays.asList(FinancialInstrumentContractType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}