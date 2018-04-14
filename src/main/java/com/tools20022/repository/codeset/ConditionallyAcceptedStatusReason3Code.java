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
import com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a conditionally accepted status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#AwaitingDocuments
 * ConditionallyAcceptedStatusReason3Code.AwaitingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#AwaitingSubscriptionMoney
 * ConditionallyAcceptedStatusReason3Code.AwaitingSubscriptionMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#PossibleDuplicate
 * ConditionallyAcceptedStatusReason3Code.PossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#TradingLimitExceeded
 * ConditionallyAcceptedStatusReason3Code.TradingLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#BenefitPlanDeclaration
 * ConditionallyAcceptedStatusReason3Code.BenefitPlanDeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#ERISADeclaration
 * ConditionallyAcceptedStatusReason3Code.ERISADeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#AMLDocuments
 * ConditionallyAcceptedStatusReason3Code.AMLDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#AwaitingApproval
 * ConditionallyAcceptedStatusReason3Code.AwaitingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#AdditionalFundingRequired
 * ConditionallyAcceptedStatusReason3Code.AdditionalFundingRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#BelowMinimumInitialInvestmentAmount
 * ConditionallyAcceptedStatusReason3Code.BelowMinimumInitialInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#BelowMinimumTopUpAmount
 * ConditionallyAcceptedStatusReason3Code.BelowMinimumTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#InsufficientCapacity
 * ConditionallyAcceptedStatusReason3Code.InsufficientCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#PercentageHoldingBreach
 * ConditionallyAcceptedStatusReason3Code.PercentageHoldingBreach}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#BelowMinimumRedemptionAmount
 * ConditionallyAcceptedStatusReason3Code.BelowMinimumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#BelowMinimumRetainedAmount
 * ConditionallyAcceptedStatusReason3Code.BelowMinimumRetainedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#LockUp
 * ConditionallyAcceptedStatusReason3Code.LockUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#AssetsIlliquid
 * ConditionallyAcceptedStatusReason3Code.AssetsIlliquid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#Discretion
 * ConditionallyAcceptedStatusReason3Code.Discretion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#SubscriptionTopUpAmount
 * ConditionallyAcceptedStatusReason3Code.SubscriptionTopUpAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
 * ConditionallyAcceptedStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConditionallyAcceptedStatusReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a conditionally accepted status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DOCC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ConditionallyAcceptedStatusReason3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code AwaitingDocuments = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocuments";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.AwaitingDocuments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSubscriptionMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code AwaitingSubscriptionMoney = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSubscriptionMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.AwaitingSubscriptionMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code PossibleDuplicate = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.PossibleDuplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingLimitExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code TradingLimitExceeded = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingLimitExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.TradingLimitExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenefitPlanDeclaration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code BenefitPlanDeclaration = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenefitPlanDeclaration";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.BenefitPlanDeclaration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISADeclaration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code ERISADeclaration = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISADeclaration";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.ERISADeclaration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AMLDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code AMLDocuments = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLDocuments";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.AMLDocuments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code AwaitingApproval = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.AwaitingApproval.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalFundingRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code AdditionalFundingRequired = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalFundingRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.AdditionalFundingRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumInitialInvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code BelowMinimumInitialInvestmentAmount = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInitialInvestmentAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.BelowMinimumInitialInvestmentAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumTopUpAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code BelowMinimumTopUpAmount = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumTopUpAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.BelowMinimumTopUpAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code InsufficientCapacity = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCapacity";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.InsufficientCapacity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageHoldingBreach"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code PercentageHoldingBreach = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageHoldingBreach";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.PercentageHoldingBreach.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code BelowMinimumRedemptionAmount = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRedemptionAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.BelowMinimumRedemptionAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRetainedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code BelowMinimumRetainedAmount = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRetainedAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.BelowMinimumRetainedAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LockUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code LockUp = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockUp";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.LockUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetsIlliquid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code AssetsIlliquid = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsIlliquid";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.AssetsIlliquid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code Discretion = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretion";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.Discretion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionTopUpAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason3Code SubscriptionTopUpAmount = new ConditionallyAcceptedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionTopUpAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.SubscriptionTopUpAmount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ConditionallyAcceptedStatusReason3Code> codesByName = new LinkedHashMap<>();

	protected ConditionallyAcceptedStatusReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DOCC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConditionallyAcceptedStatusReason3Code";
				definition = "Specifies the reason for a conditionally accepted status.";
				trace_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.AwaitingDocuments, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.AwaitingSubscriptionMoney,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.PossibleDuplicate, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.TradingLimitExceeded,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.BenefitPlanDeclaration, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.ERISADeclaration,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.AMLDocuments, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.AwaitingApproval,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.AdditionalFundingRequired, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.BelowMinimumInitialInvestmentAmount,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.BelowMinimumTopUpAmount, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.InsufficientCapacity,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.PercentageHoldingBreach, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.BelowMinimumRedemptionAmount,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.BelowMinimumRetainedAmount, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.LockUp,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.AssetsIlliquid, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.Discretion,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.SubscriptionTopUpAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingDocuments.getCodeName().get(), AwaitingDocuments);
		codesByName.put(AwaitingSubscriptionMoney.getCodeName().get(), AwaitingSubscriptionMoney);
		codesByName.put(PossibleDuplicate.getCodeName().get(), PossibleDuplicate);
		codesByName.put(TradingLimitExceeded.getCodeName().get(), TradingLimitExceeded);
		codesByName.put(BenefitPlanDeclaration.getCodeName().get(), BenefitPlanDeclaration);
		codesByName.put(ERISADeclaration.getCodeName().get(), ERISADeclaration);
		codesByName.put(AMLDocuments.getCodeName().get(), AMLDocuments);
		codesByName.put(AwaitingApproval.getCodeName().get(), AwaitingApproval);
		codesByName.put(AdditionalFundingRequired.getCodeName().get(), AdditionalFundingRequired);
		codesByName.put(BelowMinimumInitialInvestmentAmount.getCodeName().get(), BelowMinimumInitialInvestmentAmount);
		codesByName.put(BelowMinimumTopUpAmount.getCodeName().get(), BelowMinimumTopUpAmount);
		codesByName.put(InsufficientCapacity.getCodeName().get(), InsufficientCapacity);
		codesByName.put(PercentageHoldingBreach.getCodeName().get(), PercentageHoldingBreach);
		codesByName.put(BelowMinimumRedemptionAmount.getCodeName().get(), BelowMinimumRedemptionAmount);
		codesByName.put(BelowMinimumRetainedAmount.getCodeName().get(), BelowMinimumRetainedAmount);
		codesByName.put(LockUp.getCodeName().get(), LockUp);
		codesByName.put(AssetsIlliquid.getCodeName().get(), AssetsIlliquid);
		codesByName.put(Discretion.getCodeName().get(), Discretion);
		codesByName.put(SubscriptionTopUpAmount.getCodeName().get(), SubscriptionTopUpAmount);
	}

	public static ConditionallyAcceptedStatusReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ConditionallyAcceptedStatusReason3Code[] values() {
		ConditionallyAcceptedStatusReason3Code[] values = new ConditionallyAcceptedStatusReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ConditionallyAcceptedStatusReason3Code> {
		@Override
		public ConditionallyAcceptedStatusReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ConditionallyAcceptedStatusReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}