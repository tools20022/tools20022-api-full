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
import com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a conditionally accepted status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
 * ConditionallyAcceptedStatusReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmAwaitingDocuments
 * ConditionallyAcceptedStatusReason3Code.mmAwaitingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmAwaitingSubscriptionMoney
 * ConditionallyAcceptedStatusReason3Code.mmAwaitingSubscriptionMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmPossibleDuplicate
 * ConditionallyAcceptedStatusReason3Code.mmPossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmTradingLimitExceeded
 * ConditionallyAcceptedStatusReason3Code.mmTradingLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmBenefitPlanDeclaration
 * ConditionallyAcceptedStatusReason3Code.mmBenefitPlanDeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmERISADeclaration
 * ConditionallyAcceptedStatusReason3Code.mmERISADeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmAMLDocuments
 * ConditionallyAcceptedStatusReason3Code.mmAMLDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmAwaitingApproval
 * ConditionallyAcceptedStatusReason3Code.mmAwaitingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmAdditionalFundingRequired
 * ConditionallyAcceptedStatusReason3Code.mmAdditionalFundingRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmBelowMinimumInitialInvestmentAmount
 * ConditionallyAcceptedStatusReason3Code.mmBelowMinimumInitialInvestmentAmount}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmBelowMinimumTopUpAmount
 * ConditionallyAcceptedStatusReason3Code.mmBelowMinimumTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmInsufficientCapacity
 * ConditionallyAcceptedStatusReason3Code.mmInsufficientCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmPercentageHoldingBreach
 * ConditionallyAcceptedStatusReason3Code.mmPercentageHoldingBreach}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmBelowMinimumRedemptionAmount
 * ConditionallyAcceptedStatusReason3Code.mmBelowMinimumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmBelowMinimumRetainedAmount
 * ConditionallyAcceptedStatusReason3Code.mmBelowMinimumRetainedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmLockUp
 * ConditionallyAcceptedStatusReason3Code.mmLockUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmAssetsIlliquid
 * ConditionallyAcceptedStatusReason3Code.mmAssetsIlliquid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmDiscretion
 * ConditionallyAcceptedStatusReason3Code.mmDiscretion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code#mmSubscriptionTopUpAmount
 * ConditionallyAcceptedStatusReason3Code.mmSubscriptionTopUpAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConditionallyAcceptedStatusReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a conditionally accepted status."</li>
 * </ul>
 */
public class ConditionallyAcceptedStatusReason3Code extends ConditionallyAcceptedStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code
	 * ConditionallyAcceptedStatusReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocuments"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingDocuments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocuments";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSubscriptionMoney"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingSubscriptionMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSubscriptionMoney";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * </ul>
	 */
	public static final MMCode mmPossibleDuplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingLimitExceeded"</li>
	 * </ul>
	 */
	public static final MMCode mmTradingLimitExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingLimitExceeded";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenefitPlanDeclaration"</li>
	 * </ul>
	 */
	public static final MMCode mmBenefitPlanDeclaration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenefitPlanDeclaration";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISADeclaration"</li>
	 * </ul>
	 */
	public static final MMCode mmERISADeclaration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISADeclaration";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AMLDocuments"</li>
	 * </ul>
	 */
	public static final MMCode mmAMLDocuments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLDocuments";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingApproval"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingApproval";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalFundingRequired"</li>
	 * </ul>
	 */
	public static final MMCode mmAdditionalFundingRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalFundingRequired";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumInitialInvestmentAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumInitialInvestmentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInitialInvestmentAmount";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumTopUpAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumTopUpAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumTopUpAmount";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCapacity"</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCapacity";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageHoldingBreach"</li>
	 * </ul>
	 */
	public static final MMCode mmPercentageHoldingBreach = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageHoldingBreach";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRedemptionAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumRedemptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRedemptionAmount";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRetainedAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumRetainedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRetainedAmount";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LockUp"</li>
	 * </ul>
	 */
	public static final MMCode mmLockUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockUp";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetsIlliquid"</li>
	 * </ul>
	 */
	public static final MMCode mmAssetsIlliquid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsIlliquid";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretion"</li>
	 * </ul>
	 */
	public static final MMCode mmDiscretion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretion";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionTopUpAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmSubscriptionTopUpAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionTopUpAmount";
			owner_lazy = () -> ConditionallyAcceptedStatusReason3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("DOCC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ConditionallyAcceptedStatusReason3Code";
				definition = "Specifies the reason for a conditionally accepted status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmAwaitingDocuments,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmAwaitingSubscriptionMoney, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmPossibleDuplicate,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmTradingLimitExceeded, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmBenefitPlanDeclaration,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmERISADeclaration, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmAMLDocuments,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmAwaitingApproval, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmAdditionalFundingRequired,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmBelowMinimumInitialInvestmentAmount, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmBelowMinimumTopUpAmount,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmInsufficientCapacity, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmPercentageHoldingBreach,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmBelowMinimumRedemptionAmount, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmBelowMinimumRetainedAmount,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmLockUp, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmAssetsIlliquid,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmDiscretion, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason3Code.mmSubscriptionTopUpAmount);
				trace_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}