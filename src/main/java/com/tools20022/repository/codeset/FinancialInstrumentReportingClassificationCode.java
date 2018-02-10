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
import com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the financial instrument reporting classification for both equity
 * and non-equity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#SecuritisedDerivative
 * FinancialInstrumentReportingClassificationCode.SecuritisedDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#StructuredFinanceProduct
 * FinancialInstrumentReportingClassificationCode.StructuredFinanceProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#Bond
 * FinancialInstrumentReportingClassificationCode.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#EmissionAllowance
 * FinancialInstrumentReportingClassificationCode.EmissionAllowance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#ContractForDifference
 * FinancialInstrumentReportingClassificationCode.ContractForDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#Derivative
 * FinancialInstrumentReportingClassificationCode.Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#Share
 * FinancialInstrumentReportingClassificationCode.Share}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#ElectronicTradedFund
 * FinancialInstrumentReportingClassificationCode.ElectronicTradedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#DepositaryReceipt
 * FinancialInstrumentReportingClassificationCode.DepositaryReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#Other
 * FinancialInstrumentReportingClassificationCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#Certificate
 * FinancialInstrumentReportingClassificationCode.Certificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#ExchangeTradedNote
 * FinancialInstrumentReportingClassificationCode.ExchangeTradedNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode#ExchangeTradedCommodities
 * FinancialInstrumentReportingClassificationCode.ExchangeTradedCommodities}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code
 * NonEquityInstrumentReportingClassification1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code
 * EquityInstrumentReportingClassification1Code}</li>
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
 * "FinancialInstrumentReportingClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the financial instrument reporting classification for both equity and non-equity."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialInstrumentReportingClassificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Contract is of type securitised derivatives.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDRV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritisedDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type securitised derivatives."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode SecuritisedDerivative = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritisedDerivative";
			definition = "Contract is of type securitised derivatives.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "SDRV";
		}
	};
	/**
	 * Contract is of type structured finance products (SFPs).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredFinanceProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type structured finance products (SFPs)."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode StructuredFinanceProduct = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredFinanceProduct";
			definition = "Contract is of type structured finance products (SFPs).";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "SFPS";
		}
	};
	/**
	 * Contract is of type bonds.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type bonds.\r\n"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode Bond = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Contract is of type bonds.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "BOND";
		}
	};
	/**
	 * Contract is of type emission allowances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmissionAllowance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type emission allowances."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode EmissionAllowance = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowance";
			definition = "Contract is of type emission allowances.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "EMAL";
		}
	};
	/**
	 * Contract is of type contract for difference (CFD).<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
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
	 * definition} = "Contract is of type contract for difference (CFD).\r\n"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode ContractForDifference = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractForDifference";
			definition = "Contract is of type contract for difference (CFD).\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "CFDS";
		}
	};
	/**
	 * Contract is of type derivative.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DERV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type derivative.\r\n"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode Derivative = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Derivative";
			definition = "Contract is of type derivative.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "DERV";
		}
	};
	/**
	 * Contract is of type shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Share"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type shares."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode Share = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Share";
			definition = "Contract is of type shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "SHRS";
		}
	};
	/**
	 * Contract is of type electronic traded funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicTradedFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type electronic traded funds."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode ElectronicTradedFund = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicTradedFund";
			definition = "Contract is of type electronic traded funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "ETFS";
		}
	};
	/**
	 * Contract is of type depositary receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositaryReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type depositary receipt."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode DepositaryReceipt = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositaryReceipt";
			definition = "Contract is of type depositary receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "DPRS";
		}
	};
	/**
	 * Contract is of type other equity-like financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
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
	 * definition} =
	 * "Contract is of type other equity-like financial instrument."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode Other = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Contract is of type other equity-like financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Contract is of type certificates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type certificates."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode Certificate = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Contract is of type certificates.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "CRFT";
		}
	};
	/**
	 * Contract is of type exchange traded note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type exchange traded note."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode ExchangeTradedNote = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedNote";
			definition = "Contract is of type exchange traded note.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "ETNS";
		}
	};
	/**
	 * Contract is of type exchange traded commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
	 * FinancialInstrumentReportingClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedCommodities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is of type exchange traded commodities."</li>
	 * </ul>
	 */
	public static final FinancialInstrumentReportingClassificationCode ExchangeTradedCommodities = new FinancialInstrumentReportingClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedCommodities";
			definition = "Contract is of type exchange traded commodities.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.mmObject();
			codeName = "ETCS";
		}
	};
	final static private LinkedHashMap<String, FinancialInstrumentReportingClassificationCode> codesByName = new LinkedHashMap<>();

	protected FinancialInstrumentReportingClassificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentReportingClassificationCode";
				definition = "Specifies the financial instrument reporting classification for both equity and non-equity.";
				derivation_lazy = () -> Arrays.asList(NonEquityInstrumentReportingClassification1Code.mmObject(), EquityInstrumentReportingClassification1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.SecuritisedDerivative,
						com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.StructuredFinanceProduct, com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.Bond,
						com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.EmissionAllowance, com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.ContractForDifference,
						com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.Derivative, com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.Share,
						com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.ElectronicTradedFund, com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.DepositaryReceipt,
						com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.Other, com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.Certificate,
						com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.ExchangeTradedNote, com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode.ExchangeTradedCommodities);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SecuritisedDerivative.getCodeName().get(), SecuritisedDerivative);
		codesByName.put(StructuredFinanceProduct.getCodeName().get(), StructuredFinanceProduct);
		codesByName.put(Bond.getCodeName().get(), Bond);
		codesByName.put(EmissionAllowance.getCodeName().get(), EmissionAllowance);
		codesByName.put(ContractForDifference.getCodeName().get(), ContractForDifference);
		codesByName.put(Derivative.getCodeName().get(), Derivative);
		codesByName.put(Share.getCodeName().get(), Share);
		codesByName.put(ElectronicTradedFund.getCodeName().get(), ElectronicTradedFund);
		codesByName.put(DepositaryReceipt.getCodeName().get(), DepositaryReceipt);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Certificate.getCodeName().get(), Certificate);
		codesByName.put(ExchangeTradedNote.getCodeName().get(), ExchangeTradedNote);
		codesByName.put(ExchangeTradedCommodities.getCodeName().get(), ExchangeTradedCommodities);
	}

	public static FinancialInstrumentReportingClassificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialInstrumentReportingClassificationCode[] values() {
		FinancialInstrumentReportingClassificationCode[] values = new FinancialInstrumentReportingClassificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialInstrumentReportingClassificationCode> {
		@Override
		public FinancialInstrumentReportingClassificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialInstrumentReportingClassificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}