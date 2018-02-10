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
import com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the contract type of a derivate financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#ContractForDifference
 * FinancialInstrumentContractTypeCode.ContractForDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#ForwardRateAgreement
 * FinancialInstrumentContractTypeCode.ForwardRateAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#Futures
 * FinancialInstrumentContractTypeCode.Futures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#Forward
 * FinancialInstrumentContractTypeCode.Forward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#Option
 * FinancialInstrumentContractTypeCode.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#Swap
 * FinancialInstrumentContractTypeCode.Swap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#SpreadBetting
 * FinancialInstrumentContractTypeCode.SpreadBetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#Swaption
 * FinancialInstrumentContractTypeCode.Swaption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#Other
 * FinancialInstrumentContractTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#FuturesOnSwap
 * FinancialInstrumentContractTypeCode.FuturesOnSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#PortfolioSwap
 * FinancialInstrumentContractTypeCode.PortfolioSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#ForwardsOnASwap
 * FinancialInstrumentContractTypeCode.ForwardsOnASwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode#ForwardFreightAgreement
 * FinancialInstrumentContractTypeCode.ForwardFreightAgreement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
 * FinancialInstrumentContractType1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType2Code
 * FinancialInstrumentContractType2Code}</li>
 * </ul>
 * </li>
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
 * "FinancialInstrumentContractTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the contract type of a derivate financial instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialInstrumentContractTypeCode extends MMCode {

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
	public static final FinancialInstrumentContractTypeCode ContractForDifference = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractForDifference";
			definition = "Contract of type contracts for difference.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode ForwardRateAgreement = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardRateAgreement";
			definition = "Contract of type forward rate agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode Futures = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Contract of type future.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode Forward = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forward";
			definition = "Contract of type forward.\r\n\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode Option = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Contract of type option.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode Swap = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			definition = "Contract of type swap.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode SpreadBetting = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadBetting";
			definition = "Contract of type spread betting.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode Swaption = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaption";
			definition = "Contract of type swaption.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	 * definition} = "Contract of other financial instrument contract type."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentContractTypeCode Other = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Contract of other financial instrument contract type.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode FuturesOnSwap = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FuturesOnSwap";
			definition = "Contract of type future on a swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode PortfolioSwap = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioSwap";
			definition = "Contract of type portfolio swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode ForwardsOnASwap = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardsOnASwap";
			definition = "Contract of type forwards on a swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
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
	public static final FinancialInstrumentContractTypeCode ForwardFreightAgreement = new FinancialInstrumentContractTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardFreightAgreement";
			definition = "Contract of type forward freight agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.mmObject();
			codeName = "FFAS";
		}
	};
	final static private LinkedHashMap<String, FinancialInstrumentContractTypeCode> codesByName = new LinkedHashMap<>();

	protected FinancialInstrumentContractTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentContractTypeCode";
				definition = "Specifies the contract type of a derivate financial instrument.";
				derivation_lazy = () -> Arrays.asList(FinancialInstrumentContractType1Code.mmObject(), FinancialInstrumentContractType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.ContractForDifference, com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.ForwardRateAgreement,
						com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.Futures, com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.Forward,
						com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.Option, com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.Swap,
						com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.SpreadBetting, com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.Swaption,
						com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.Other, com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.FuturesOnSwap,
						com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.PortfolioSwap, com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.ForwardsOnASwap,
						com.tools20022.repository.codeset.FinancialInstrumentContractTypeCode.ForwardFreightAgreement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ContractForDifference.getCodeName().get(), ContractForDifference);
		codesByName.put(ForwardRateAgreement.getCodeName().get(), ForwardRateAgreement);
		codesByName.put(Futures.getCodeName().get(), Futures);
		codesByName.put(Forward.getCodeName().get(), Forward);
		codesByName.put(Option.getCodeName().get(), Option);
		codesByName.put(Swap.getCodeName().get(), Swap);
		codesByName.put(SpreadBetting.getCodeName().get(), SpreadBetting);
		codesByName.put(Swaption.getCodeName().get(), Swaption);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(FuturesOnSwap.getCodeName().get(), FuturesOnSwap);
		codesByName.put(PortfolioSwap.getCodeName().get(), PortfolioSwap);
		codesByName.put(ForwardsOnASwap.getCodeName().get(), ForwardsOnASwap);
		codesByName.put(ForwardFreightAgreement.getCodeName().get(), ForwardFreightAgreement);
	}

	public static FinancialInstrumentContractTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialInstrumentContractTypeCode[] values() {
		FinancialInstrumentContractTypeCode[] values = new FinancialInstrumentContractTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialInstrumentContractTypeCode> {
		@Override
		public FinancialInstrumentContractTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialInstrumentContractTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}