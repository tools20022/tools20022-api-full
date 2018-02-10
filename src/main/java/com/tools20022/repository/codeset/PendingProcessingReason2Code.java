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
import com.tools20022.repository.codeset.PendingProcessingReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason the transaction/instruction is failing settlement.
 * Settlement on the instructed settlement date is no longer possible.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#AccountServicerDeadlineMissed
 * PendingProcessingReason2Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#AwaitingSecurities
 * PendingProcessingReason2Code.AwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#AwaitingDocumentsOrEndorsementsFromYou
 * PendingProcessingReason2Code.AwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#NoForeignExchangeInstruction
 * PendingProcessingReason2Code.NoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#AccountBlocked
 * PendingProcessingReason2Code.AccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#MultipleSettlementAmount
 * PendingProcessingReason2Code.MultipleSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#GlobalFormSecurities
 * PendingProcessingReason2Code.GlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#CollateralShortage
 * PendingProcessingReason2Code.CollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#SecuritiesPledgedAsCollateral
 * PendingProcessingReason2Code.SecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#MaximumForeignLimitReached
 * PendingProcessingReason2Code.MaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#NextProcess
 * PendingProcessingReason2Code.NextProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#LackOfSecurities
 * PendingProcessingReason2Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#SecuritiesLoanedOut
 * PendingProcessingReason2Code.SecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#InsufficientMoney
 * PendingProcessingReason2Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#MinimumSettlementAmount
 * PendingProcessingReason2Code.MinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#Other
 * PendingProcessingReason2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#UnavailableDeliverableDenominatedQuantity
 * PendingProcessingReason2Code.UnavailableDeliverableDenominatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#InsufficientCentralBankLiquidity
 * PendingProcessingReason2Code.InsufficientCentralBankLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#WrongCertificatesNumbers
 * PendingProcessingReason2Code.WrongCertificatesNumbers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#CSDHold
 * PendingProcessingReason2Code.CSDHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#CSDValidation
 * PendingProcessingReason2Code.CSDValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#ConditionalDelivery
 * PendingProcessingReason2Code.ConditionalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#ConditionalDeliveryAwaitingRelease
 * PendingProcessingReason2Code.ConditionalDeliveryAwaitingRelease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#ConditionalDeliveryAwaitingCancellation
 * PendingProcessingReason2Code.ConditionalDeliveryAwaitingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code#IncompleteNumberCount
 * PendingProcessingReason2Code.IncompleteNumberCount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
 * PendingFailingReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PendingProcessingReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is failing settlement. Settlement on the instructed settlement date is no longer possible."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
 * PendingProcessingReason1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingProcessingReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code AccountServicerDeadlineMissed = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecurities"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code AwaitingSecurities = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromYou"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code AwaitingDocumentsOrEndorsementsFromYou = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingDocumentsOrEndorsementsFromYou.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoForeignExchangeInstruction"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code NoForeignExchangeInstruction = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoForeignExchangeInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.NoForeignExchangeInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlocked"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code AccountBlocked = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AccountBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementAmount"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code MultipleSettlementAmount = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.MultipleSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalFormSecurities"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code GlobalFormSecurities = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalFormSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.GlobalFormSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralShortage"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code CollateralShortage = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralShortage";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CollateralShortage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPledgedAsCollateral"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code SecuritiesPledgedAsCollateral = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesPledgedAsCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumForeignLimitReached"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code MaximumForeignLimitReached = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumForeignLimitReached";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.MaximumForeignLimitReached.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextProcess"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code NextProcess = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.NextProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code LackOfSecurities = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.LackOfSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLoanedOut"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code SecuritiesLoanedOut = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLoanedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesLoanedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code InsufficientMoney = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementAmount"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code MinimumSettlementAmount = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.MinimumSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code Other = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableDeliverableDenominatedQuantity"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code UnavailableDeliverableDenominatedQuantity = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailableDeliverableDenominatedQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.UnavailableDeliverableDenominatedQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCentralBankLiquidity"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code InsufficientCentralBankLiquidity = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCentralBankLiquidity";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientCentralBankLiquidity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCertificatesNumbers"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code WrongCertificatesNumbers = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCertificatesNumbers";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.WrongCertificatesNumbers.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDHold"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code CSDHold = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDHold";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CSDHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDValidation"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code CSDValidation = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CSDValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDelivery"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code ConditionalDelivery = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.ConditionalDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDeliveryAwaitingRelease"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code ConditionalDeliveryAwaitingRelease = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryAwaitingRelease";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.ConditionalDeliveryAwaitingRelease.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDeliveryAwaitingCancellation"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code ConditionalDeliveryAwaitingCancellation = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryAwaitingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.ConditionalDeliveryAwaitingCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
	 * PendingProcessingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncompleteNumberCount"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason2Code IncompleteNumberCount = new PendingProcessingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncompleteNumberCount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.IncompleteNumberCount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingProcessingReason2Code> codesByName = new LinkedHashMap<>();

	protected PendingProcessingReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingProcessingReason2Code";
				definition = "Specifies the reason the transaction/instruction is failing settlement. Settlement on the instructed settlement date is no longer possible.";
				previousVersion_lazy = () -> PendingProcessingReason1Code.mmObject();
				trace_lazy = () -> PendingFailingReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingProcessingReason2Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.PendingProcessingReason2Code.AwaitingSecurities,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.AwaitingDocumentsOrEndorsementsFromYou, com.tools20022.repository.codeset.PendingProcessingReason2Code.NoForeignExchangeInstruction,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.AccountBlocked, com.tools20022.repository.codeset.PendingProcessingReason2Code.MultipleSettlementAmount,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.GlobalFormSecurities, com.tools20022.repository.codeset.PendingProcessingReason2Code.CollateralShortage,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.SecuritiesPledgedAsCollateral, com.tools20022.repository.codeset.PendingProcessingReason2Code.MaximumForeignLimitReached,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.NextProcess, com.tools20022.repository.codeset.PendingProcessingReason2Code.LackOfSecurities,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.SecuritiesLoanedOut, com.tools20022.repository.codeset.PendingProcessingReason2Code.InsufficientMoney,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.MinimumSettlementAmount, com.tools20022.repository.codeset.PendingProcessingReason2Code.Other,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.UnavailableDeliverableDenominatedQuantity, com.tools20022.repository.codeset.PendingProcessingReason2Code.InsufficientCentralBankLiquidity,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.WrongCertificatesNumbers, com.tools20022.repository.codeset.PendingProcessingReason2Code.CSDHold,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.CSDValidation, com.tools20022.repository.codeset.PendingProcessingReason2Code.ConditionalDelivery,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.ConditionalDeliveryAwaitingRelease, com.tools20022.repository.codeset.PendingProcessingReason2Code.ConditionalDeliveryAwaitingCancellation,
						com.tools20022.repository.codeset.PendingProcessingReason2Code.IncompleteNumberCount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(AwaitingSecurities.getCodeName().get(), AwaitingSecurities);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromYou.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromYou);
		codesByName.put(NoForeignExchangeInstruction.getCodeName().get(), NoForeignExchangeInstruction);
		codesByName.put(AccountBlocked.getCodeName().get(), AccountBlocked);
		codesByName.put(MultipleSettlementAmount.getCodeName().get(), MultipleSettlementAmount);
		codesByName.put(GlobalFormSecurities.getCodeName().get(), GlobalFormSecurities);
		codesByName.put(CollateralShortage.getCodeName().get(), CollateralShortage);
		codesByName.put(SecuritiesPledgedAsCollateral.getCodeName().get(), SecuritiesPledgedAsCollateral);
		codesByName.put(MaximumForeignLimitReached.getCodeName().get(), MaximumForeignLimitReached);
		codesByName.put(NextProcess.getCodeName().get(), NextProcess);
		codesByName.put(LackOfSecurities.getCodeName().get(), LackOfSecurities);
		codesByName.put(SecuritiesLoanedOut.getCodeName().get(), SecuritiesLoanedOut);
		codesByName.put(InsufficientMoney.getCodeName().get(), InsufficientMoney);
		codesByName.put(MinimumSettlementAmount.getCodeName().get(), MinimumSettlementAmount);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(UnavailableDeliverableDenominatedQuantity.getCodeName().get(), UnavailableDeliverableDenominatedQuantity);
		codesByName.put(InsufficientCentralBankLiquidity.getCodeName().get(), InsufficientCentralBankLiquidity);
		codesByName.put(WrongCertificatesNumbers.getCodeName().get(), WrongCertificatesNumbers);
		codesByName.put(CSDHold.getCodeName().get(), CSDHold);
		codesByName.put(CSDValidation.getCodeName().get(), CSDValidation);
		codesByName.put(ConditionalDelivery.getCodeName().get(), ConditionalDelivery);
		codesByName.put(ConditionalDeliveryAwaitingRelease.getCodeName().get(), ConditionalDeliveryAwaitingRelease);
		codesByName.put(ConditionalDeliveryAwaitingCancellation.getCodeName().get(), ConditionalDeliveryAwaitingCancellation);
		codesByName.put(IncompleteNumberCount.getCodeName().get(), IncompleteNumberCount);
	}

	public static PendingProcessingReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingProcessingReason2Code[] values() {
		PendingProcessingReason2Code[] values = new PendingProcessingReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingProcessingReason2Code> {
		@Override
		public PendingProcessingReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingProcessingReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}