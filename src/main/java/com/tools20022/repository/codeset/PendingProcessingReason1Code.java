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
import com.tools20022.repository.codeset.PendingProcessingReason1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#AccountServicerDeadlineMissed
 * PendingProcessingReason1Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#AwaitingSecurities
 * PendingProcessingReason1Code.AwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#AwaitingDocumentsOrEndorsementsFromYou
 * PendingProcessingReason1Code.AwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#NoForeignExchangeInstruction
 * PendingProcessingReason1Code.NoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#AccountBlocked
 * PendingProcessingReason1Code.AccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#MultipleSettlementAmount
 * PendingProcessingReason1Code.MultipleSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#GlobalFormSecurities
 * PendingProcessingReason1Code.GlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#CollateralShortage
 * PendingProcessingReason1Code.CollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#SecuritiesPledgedAsCollateral
 * PendingProcessingReason1Code.SecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#MaximumForeignLimitReached
 * PendingProcessingReason1Code.MaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#NextProcess
 * PendingProcessingReason1Code.NextProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#LackOfSecurities
 * PendingProcessingReason1Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#SecuritiesLoanedOut
 * PendingProcessingReason1Code.SecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#InsufficientMoney
 * PendingProcessingReason1Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#MinimumSettlementAmount
 * PendingProcessingReason1Code.MinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#Other
 * PendingProcessingReason1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#UnavailableDeliverableDenominatedQuantity
 * PendingProcessingReason1Code.UnavailableDeliverableDenominatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#InsufficientCentralBankLiquidity
 * PendingProcessingReason1Code.InsufficientCentralBankLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code#WrongCertificatesNumbers
 * PendingProcessingReason1Code.WrongCertificatesNumbers}</li>
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
 * "PendingProcessingReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is failing settlement. Settlement on the instructed settlement date is no longer possible."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason2Code
 * PendingProcessingReason2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingProcessingReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code AccountServicerDeadlineMissed = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecurities"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code AwaitingSecurities = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromYou"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code AwaitingDocumentsOrEndorsementsFromYou = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingDocumentsOrEndorsementsFromYou.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoForeignExchangeInstruction"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code NoForeignExchangeInstruction = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoForeignExchangeInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.NoForeignExchangeInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlocked"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code AccountBlocked = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.AccountBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementAmount"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code MultipleSettlementAmount = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.MultipleSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalFormSecurities"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code GlobalFormSecurities = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalFormSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.GlobalFormSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralShortage"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code CollateralShortage = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralShortage";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.CollateralShortage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPledgedAsCollateral"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code SecuritiesPledgedAsCollateral = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesPledgedAsCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumForeignLimitReached"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code MaximumForeignLimitReached = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumForeignLimitReached";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.MaximumForeignLimitReached.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextProcess"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code NextProcess = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.NextProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code LackOfSecurities = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.LackOfSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLoanedOut"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code SecuritiesLoanedOut = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLoanedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesLoanedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code InsufficientMoney = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementAmount"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code MinimumSettlementAmount = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.MinimumSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code Other = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableDeliverableDenominatedQuantity"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code UnavailableDeliverableDenominatedQuantity = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailableDeliverableDenominatedQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.UnavailableDeliverableDenominatedQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCentralBankLiquidity"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code InsufficientCentralBankLiquidity = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCentralBankLiquidity";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientCentralBankLiquidity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingProcessingReason1Code
	 * PendingProcessingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCertificatesNumbers"</li>
	 * </ul>
	 */
	public static final PendingProcessingReason1Code WrongCertificatesNumbers = new PendingProcessingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCertificatesNumbers";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingProcessingReason1Code.mmObject();
			codeName = PendingFailingReasonCode.WrongCertificatesNumbers.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingProcessingReason1Code> codesByName = new LinkedHashMap<>();

	protected PendingProcessingReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingProcessingReason1Code";
				definition = "Specifies the reason the transaction/instruction is failing settlement. Settlement on the instructed settlement date is no longer possible.";
				nextVersions_lazy = () -> Arrays.asList(PendingProcessingReason2Code.mmObject());
				trace_lazy = () -> PendingFailingReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingProcessingReason1Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.PendingProcessingReason1Code.AwaitingSecurities,
						com.tools20022.repository.codeset.PendingProcessingReason1Code.AwaitingDocumentsOrEndorsementsFromYou, com.tools20022.repository.codeset.PendingProcessingReason1Code.NoForeignExchangeInstruction,
						com.tools20022.repository.codeset.PendingProcessingReason1Code.AccountBlocked, com.tools20022.repository.codeset.PendingProcessingReason1Code.MultipleSettlementAmount,
						com.tools20022.repository.codeset.PendingProcessingReason1Code.GlobalFormSecurities, com.tools20022.repository.codeset.PendingProcessingReason1Code.CollateralShortage,
						com.tools20022.repository.codeset.PendingProcessingReason1Code.SecuritiesPledgedAsCollateral, com.tools20022.repository.codeset.PendingProcessingReason1Code.MaximumForeignLimitReached,
						com.tools20022.repository.codeset.PendingProcessingReason1Code.NextProcess, com.tools20022.repository.codeset.PendingProcessingReason1Code.LackOfSecurities,
						com.tools20022.repository.codeset.PendingProcessingReason1Code.SecuritiesLoanedOut, com.tools20022.repository.codeset.PendingProcessingReason1Code.InsufficientMoney,
						com.tools20022.repository.codeset.PendingProcessingReason1Code.MinimumSettlementAmount, com.tools20022.repository.codeset.PendingProcessingReason1Code.Other,
						com.tools20022.repository.codeset.PendingProcessingReason1Code.UnavailableDeliverableDenominatedQuantity, com.tools20022.repository.codeset.PendingProcessingReason1Code.InsufficientCentralBankLiquidity,
						com.tools20022.repository.codeset.PendingProcessingReason1Code.WrongCertificatesNumbers);
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
	}

	public static PendingProcessingReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingProcessingReason1Code[] values() {
		PendingProcessingReason1Code[] values = new PendingProcessingReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingProcessingReason1Code> {
		@Override
		public PendingProcessingReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingProcessingReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}