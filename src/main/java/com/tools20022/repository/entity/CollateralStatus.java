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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.CollateralCancellationType1Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the collateral or of an event related to collateral.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralStatus" src="doc-files/CollateralStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#ResponseStatus
 * CollateralStatus.ResponseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#CollateralManagementCancellationReason
 * CollateralStatus.CollateralManagementCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#SubstitutionStatus
 * CollateralStatus.SubstitutionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#InterestRejectionReason
 * CollateralStatus.InterestRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#MarginCallResponse
 * CollateralStatus.MarginCallResponse}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralStatus#Settlement
 * CollateralStatus.Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#CancellationReason
 * CollateralStatus.CancellationReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralStatus#Collateral
 * CollateralStatus.Collateral}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#Status
 * Collateral.Status}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralCancellationType1Choice
 * CollateralCancellationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralCancellationReason1
 * CollateralCancellationReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionStatus2
 * RejectionStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1
 * CollateralCancellationStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1
 * CollateralProposalResponseType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralConfirmation1
 * CollateralConfirmation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestResponse1
 * InterestResponse1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralStatusReason1
 * CollateralStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateralResponse1
 * OtherCollateralResponse1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateralResponse1
 * CashCollateralResponse1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1
 * SecuritiesCollateralResponse1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateralResponse2
 * OtherCollateralResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateralResponse2
 * CashCollateralResponse2}</li>
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
 * "CollateralStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of the collateral or of an event related to collateral."
 * </li>
 * </ul>
 */
public class CollateralStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the status of the response to a collateral claim, proposal or
	 * substitution proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseStatusCode
	 * ResponseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus1Choice#Code
	 * ResponseStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#ResponseStatus
	 * Status1Choice.ResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#ResponseStatus
	 * Status8Choice.ResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus2Choice#Code
	 * ResponseStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#ResponseStatus
	 * Status3Choice.ResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#ResponseStatus
	 * Status10Choice.ResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse1#ResponseType
	 * OtherCollateralResponse1.ResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#ResponseType
	 * CashCollateralResponse1.ResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus5Choice#Code
	 * ResponseStatus5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#ResponseStatus
	 * Status19Choice.ResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#ResponseStatus
	 * Status22Choice.ResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus7Choice#Code
	 * ResponseStatus7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2#ResponseType
	 * OtherCollateralResponse2.ResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#ResponseType
	 * CashCollateralResponse2.ResponseType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the response to a collateral claim, proposal or substitution proposal."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ResponseStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ResponseStatus1Choice.Code, com.tools20022.repository.choice.Status1Choice.ResponseStatus, com.tools20022.repository.choice.Status8Choice.ResponseStatus,
					com.tools20022.repository.choice.ResponseStatus2Choice.Code, com.tools20022.repository.choice.Status3Choice.ResponseStatus, com.tools20022.repository.choice.Status10Choice.ResponseStatus,
					com.tools20022.repository.msg.OtherCollateralResponse1.ResponseType, com.tools20022.repository.msg.CashCollateralResponse1.ResponseType, com.tools20022.repository.choice.ResponseStatus5Choice.Code,
					com.tools20022.repository.choice.Status19Choice.ResponseStatus, com.tools20022.repository.choice.Status22Choice.ResponseStatus, com.tools20022.repository.choice.ResponseStatus7Choice.Code,
					com.tools20022.repository.msg.OtherCollateralResponse2.ResponseType, com.tools20022.repository.msg.CashCollateralResponse2.ResponseType);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResponseStatus";
			definition = "Specifies the status of the response to a collateral claim, proposal or substitution proposal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ResponseStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reason for the cancellation of a message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode
	 * CollateralManagementCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralCancellationType1Choice#Code
	 * CollateralCancellationType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralCancellationType1Choice#Proprietary
	 * CollateralCancellationType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationReason1#CancellationReasonCode
	 * CollateralCancellationReason1.CancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#RejectionDetails
	 * CollateralCancellationStatus1.RejectionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagementCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the cancellation of a message."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralManagementCancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralCancellationType1Choice.Code, com.tools20022.repository.choice.CollateralCancellationType1Choice.Proprietary,
					com.tools20022.repository.msg.CollateralCancellationReason1.CancellationReasonCode, com.tools20022.repository.msg.CollateralCancellationStatus1.RejectionDetails);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralManagementCancellationReason";
			definition = "Specifies the reason for the cancellation of a message.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralManagementCancellationReasonCode.mmObject();
		}
	};
	/**
	 * Provides details about the status of the collateral substitution, either
	 * released or returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmationCode
	 * CollateralSubstitutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1#ConfirmationType
	 * CollateralConfirmation1.ConfirmationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the status of the collateral substitution, either released or returned."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubstitutionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralConfirmation1.ConfirmationType);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubstitutionStatus";
			definition = "Provides details about the status of the collateral substitution, either released or returned.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionConfirmationCode.mmObject();
		}
	};
	/**
	 * Provides the interest rejection reason using an ISO 20022 code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRejectionReasonCode
	 * InterestRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason21FormatChoice#Code
	 * RejectionReason21FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason21FormatChoice#Proprietary
	 * RejectionReason21FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1#RejectionReason
	 * InterestResponse1.RejectionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the interest rejection reason using an ISO 20022 code."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterestRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RejectionReason21FormatChoice.Code, com.tools20022.repository.choice.RejectionReason21FormatChoice.Proprietary,
					com.tools20022.repository.msg.InterestResponse1.RejectionReason);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestRejectionReason";
			definition = "Provides the interest rejection reason using an ISO 20022 code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestRejectionReasonCode.mmObject();
		}
	};
	/**
	 * Specifies whether the margin call request was sent on a non valuation day
	 * or was received after notification time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarginCallResponseCode
	 * MarginCallResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseType1Choice#Code
	 * ResponseType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseType1Choice#Proprietary
	 * ResponseType1Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the margin call request was sent on a non valuation day or was received after notification time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginCallResponse = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ResponseType1Choice.Code, com.tools20022.repository.choice.ResponseType1Choice.Proprietary);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginCallResponse";
			definition = "Specifies whether the margin call request was sent on a non valuation day or was received after notification time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MarginCallResponseCode.mmObject();
		}
	};
	/**
	 * Provides the settlement status of the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#SettlementStatus
	 * CollateralValuation1.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#SettlementStatus
	 * CollateralValuation2.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#SettlementStatus
	 * CollateralValuation5.SettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the settlement status of the collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Settlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValuation1.SettlementStatus, com.tools20022.repository.msg.CollateralValuation2.SettlementStatus,
					com.tools20022.repository.msg.CollateralValuation5.SettlementStatus);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Provides the settlement status of the collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementStatusCode.mmObject();
		}
	};
	/**
	 * Provides details about the status of the collateral cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the status of the collateral cancellation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Provides details about the status of the collateral cancellation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}
	};
	/**
	 * Collateral for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#Status
	 * Collateral.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Collateral for which a status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralStatus";
				definition = "Specifies the status of the collateral or of an event related to collateral.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.Status);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralStatus.ResponseStatus, com.tools20022.repository.entity.CollateralStatus.CollateralManagementCancellationReason,
						com.tools20022.repository.entity.CollateralStatus.SubstitutionStatus, com.tools20022.repository.entity.CollateralStatus.InterestRejectionReason, com.tools20022.repository.entity.CollateralStatus.MarginCallResponse,
						com.tools20022.repository.entity.CollateralStatus.Settlement, com.tools20022.repository.entity.CollateralStatus.CancellationReason, com.tools20022.repository.entity.CollateralStatus.Collateral);
				derivationComponent_lazy = () -> Arrays.asList(CollateralCancellationType1Choice.mmObject(), CollateralCancellationReason1.mmObject(), RejectionStatus2.mmObject(), CollateralCancellationStatus1.mmObject(),
						CollateralProposalResponseType1.mmObject(), CollateralConfirmation1.mmObject(), InterestResponse1.mmObject(), CollateralStatusReason1.mmObject(), OtherCollateralResponse1.mmObject(),
						CashCollateralResponse1.mmObject(), SecuritiesCollateralResponse1.mmObject(), OtherCollateralResponse2.mmObject(), CashCollateralResponse2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}