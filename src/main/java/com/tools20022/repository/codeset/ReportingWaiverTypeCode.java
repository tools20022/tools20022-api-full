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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of regulatory reporting pre-trade waiver.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#LargeInScale
 * ReportingWaiverTypeCode.LargeInScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#AboveSpecificSizeTransaction
 * ReportingWaiverTypeCode.AboveSpecificSizeTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#NegotiatedTransactionInIlliquidFinancialInstrument
 * ReportingWaiverTypeCode.NegotiatedTransactionInIlliquidFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#IlliquidInstrumentTransaction
 * ReportingWaiverTypeCode.IlliquidInstrumentTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#ReferencePriceTransaction
 * ReportingWaiverTypeCode.ReferencePriceTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#NegotiatedTransactionInLiquidFinancialInstrument
 * ReportingWaiverTypeCode.NegotiatedTransactionInLiquidFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#NegotiatedTransactionWithConditions
 * ReportingWaiverTypeCode.NegotiatedTransactionWithConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#BenchmarkTransaction
 * ReportingWaiverTypeCode.BenchmarkTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#AgencyCrossTransaction
 * ReportingWaiverTypeCode.AgencyCrossTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#NonPriceFormingTransaction
 * ReportingWaiverTypeCode.NonPriceFormingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#Cancellations
 * ReportingWaiverTypeCode.Cancellations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#SpecialDividendTransaction
 * ReportingWaiverTypeCode.SpecialDividendTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#Amendments
 * ReportingWaiverTypeCode.Amendments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#AlgorithmicTransaction
 * ReportingWaiverTypeCode.AlgorithmicTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#TransactionWithPriceImprovment
 * ReportingWaiverTypeCode.TransactionWithPriceImprovment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#DuplicativeTradeReport
 * ReportingWaiverTypeCode.DuplicativeTradeReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#TransactionNotContributingToPriceDiscovery
 * ReportingWaiverTypeCode.TransactionNotContributingToPriceDiscovery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#PackageTransaction
 * ReportingWaiverTypeCode.PackageTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode#ExchangeForPhysical
 * ReportingWaiverTypeCode.ExchangeForPhysical}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code
 * ReportingWaiverType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
 * ReportingWaiverType3Code}</li>
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
 * "ReportingWaiverTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of regulatory reporting pre-trade waiver."</li>
 * </ul>
 */
public class ReportingWaiverTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Large-in-scale transactions. Applicable for all instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LRGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LargeInScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Large-in-scale transactions.  Applicable for all instruments."</li>
	 * </ul>
	 */
	public static final MMCode LargeInScale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LargeInScale";
			definition = "Large-in-scale transactions.  Applicable for all instruments.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "LRGS";
		}
	};
	/**
	 * Pre-trade waiver was for an above specific size transaction. Applicable
	 * to non-equity instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIZE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AboveSpecificSizeTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-trade waiver was for an above specific size transaction. Applicable to non-equity instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AboveSpecificSizeTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AboveSpecificSizeTransaction";
			definition = "Pre-trade waiver was for an above specific size transaction. Applicable to non-equity instruments.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "SIZE";
		}
	};
	/**
	 * Pre-trade waiver was for a negotiated transaction in illiquid financial
	 * instruments. Applicable to equity instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OILQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTransactionInIlliquidFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-trade waiver was for a negotiated transaction in illiquid financial instruments. Applicable to equity instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NegotiatedTransactionInIlliquidFinancialInstrument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTransactionInIlliquidFinancialInstrument";
			definition = "Pre-trade waiver was for a negotiated transaction in illiquid financial instruments. Applicable to equity instruments.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "OILQ";
		}
	};
	/**
	 * Pre-trade waiver was for an illiquid instrument transaction. Applicable
	 * to non-equity instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ILQD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IlliquidInstrumentTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-trade waiver was for an illiquid instrument transaction. Applicable to non-equity instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode IlliquidInstrumentTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IlliquidInstrumentTransaction";
			definition = "Pre-trade waiver was for an illiquid instrument transaction. Applicable to non-equity instruments.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "ILQD";
		}
	};
	/**
	 * Pre-trade waiver was for a reference price transaction. Applicable to
	 * equity instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RFPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferencePriceTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-trade waiver was for a reference price transaction. Applicable to equity instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ReferencePriceTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePriceTransaction";
			definition = "Pre-trade waiver was for a reference price transaction. Applicable to equity instruments.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "RFPT";
		}
	};
	/**
	 * Pre-trade waiver was for a negotiated transaction in liquid financial
	 * instruments. Applicable to equity instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NLIQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTransactionInLiquidFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-trade waiver was for a negotiated transaction in liquid financial instruments. Applicable to equity instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NegotiatedTransactionInLiquidFinancialInstrument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTransactionInLiquidFinancialInstrument";
			definition = "Pre-trade waiver was for a negotiated transaction in liquid financial instruments. Applicable to equity instruments.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "NLIQ";
		}
	};
	/**
	 * Pre-trade waiver was for a negotiated transaction subject to conditions
	 * other than the current market price of that financial instruments.
	 * Applicable to equity instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTransactionWithConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-trade waiver was for a negotiated transaction subject to conditions other than the current market price of that financial instruments. Applicable to equity instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NegotiatedTransactionWithConditions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTransactionWithConditions";
			definition = "Pre-trade waiver was for a negotiated transaction subject to conditions other than the current market price of that financial instruments. Applicable to equity instruments.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * Benchmark transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Benchmark transaction."</li>
	 * </ul>
	 */
	public static final MMCode BenchmarkTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkTransaction";
			definition = "Benchmark transaction.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "BENC";
		}
	};
	/**
	 * Agency cross transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgencyCrossTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agency cross transaction."</li>
	 * </ul>
	 */
	public static final MMCode AgencyCrossTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgencyCrossTransaction";
			definition = "Agency cross transaction.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "ACTX";
		}
	};
	/**
	 * Non-price forming transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonPriceFormingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non-price forming transactions."</li>
	 * </ul>
	 */
	public static final MMCode NonPriceFormingTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonPriceFormingTransaction";
			definition = "Non-price forming transactions.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "NPFT";
		}
	};
	/**
	 * Cancellations.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellations.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode Cancellations = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellations";
			definition = "Cancellations.\r\n";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Special dividend transactions.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDividendTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Special dividend transactions.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode SpecialDividendTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDividendTransaction";
			definition = "Special dividend transactions.\r\n";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "SDIV";
		}
	};
	/**
	 * Amendments
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amendments"</li>
	 * </ul>
	 */
	public static final MMCode Amendments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendments";
			definition = "Amendments";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "AMND";
		}
	};
	/**
	 * Algorithmic transactions. Applicable to equity instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlgorithmicTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Algorithmic transactions. Applicable to equity instruments."</li>
	 * </ul>
	 */
	public static final MMCode AlgorithmicTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlgorithmicTransaction";
			definition = "Algorithmic transactions. Applicable to equity instruments.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "ALGO";
		}
	};
	/**
	 * Transactions which have received price improvement. Applicable to equity
	 * instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionWithPriceImprovment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transactions which have received price improvement. Applicable to equity instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TransactionWithPriceImprovment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionWithPriceImprovment";
			definition = "Transactions which have received price improvement. Applicable to equity instruments.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "RPRI";
		}
	};
	/**
	 * Duplicative trade reports
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicativeTradeReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Duplicative trade reports"</li>
	 * </ul>
	 */
	public static final MMCode DuplicativeTradeReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicativeTradeReport";
			definition = "Duplicative trade reports";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "DUPL";
		}
	};
	/**
	 * Transactions not contributing to the price discovery process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TNCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNotContributingToPriceDiscovery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transactions not contributing to the price discovery process."</li>
	 * </ul>
	 */
	public static final MMCode TransactionNotContributingToPriceDiscovery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNotContributingToPriceDiscovery";
			definition = "Transactions not contributing to the price discovery process.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "TNCP";
		}
	};
	/**
	 * Package transaction
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TPAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackageTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Package transaction"</li>
	 * </ul>
	 */
	public static final MMCode PackageTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PackageTransaction";
			definition = "Package transaction";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "TPAC";
		}
	};
	/**
	 * Transaction where the contract on a commodity is exchanged for the actual
	 * physical good.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
	 * ReportingWaiverTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XFPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForPhysical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction where the contract  on a commodity is exchanged for the actual physical good."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ExchangeForPhysical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForPhysical";
			definition = "Transaction where the contract  on a commodity is exchanged for the actual physical good.";
			owner_lazy = () -> ReportingWaiverTypeCode.mmObject();
			codeName = "XFPH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReportingWaiverTypeCode";
				definition = "Specifies the type of regulatory reporting pre-trade waiver.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportingWaiverTypeCode.LargeInScale, com.tools20022.repository.codeset.ReportingWaiverTypeCode.AboveSpecificSizeTransaction,
						com.tools20022.repository.codeset.ReportingWaiverTypeCode.NegotiatedTransactionInIlliquidFinancialInstrument, com.tools20022.repository.codeset.ReportingWaiverTypeCode.IlliquidInstrumentTransaction,
						com.tools20022.repository.codeset.ReportingWaiverTypeCode.ReferencePriceTransaction, com.tools20022.repository.codeset.ReportingWaiverTypeCode.NegotiatedTransactionInLiquidFinancialInstrument,
						com.tools20022.repository.codeset.ReportingWaiverTypeCode.NegotiatedTransactionWithConditions, com.tools20022.repository.codeset.ReportingWaiverTypeCode.BenchmarkTransaction,
						com.tools20022.repository.codeset.ReportingWaiverTypeCode.AgencyCrossTransaction, com.tools20022.repository.codeset.ReportingWaiverTypeCode.NonPriceFormingTransaction,
						com.tools20022.repository.codeset.ReportingWaiverTypeCode.Cancellations, com.tools20022.repository.codeset.ReportingWaiverTypeCode.SpecialDividendTransaction,
						com.tools20022.repository.codeset.ReportingWaiverTypeCode.Amendments, com.tools20022.repository.codeset.ReportingWaiverTypeCode.AlgorithmicTransaction,
						com.tools20022.repository.codeset.ReportingWaiverTypeCode.TransactionWithPriceImprovment, com.tools20022.repository.codeset.ReportingWaiverTypeCode.DuplicativeTradeReport,
						com.tools20022.repository.codeset.ReportingWaiverTypeCode.TransactionNotContributingToPriceDiscovery, com.tools20022.repository.codeset.ReportingWaiverTypeCode.PackageTransaction,
						com.tools20022.repository.codeset.ReportingWaiverTypeCode.ExchangeForPhysical);
				derivation_lazy = () -> Arrays.asList(ReportingWaiverType1Code.mmObject(), ReportingWaiverType3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}