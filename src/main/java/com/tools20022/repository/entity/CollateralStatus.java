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
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmResponseStatus
 * CollateralStatus.mmResponseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmCollateralManagementCancellationReason
 * CollateralStatus.mmCollateralManagementCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmSubstitutionStatus
 * CollateralStatus.mmSubstitutionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmInterestRejectionReason
 * CollateralStatus.mmInterestRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmMarginCallResponse
 * CollateralStatus.mmMarginCallResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmSettlement
 * CollateralStatus.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmCancellationReason
 * CollateralStatus.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmCollateral
 * CollateralStatus.mmCollateral}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmStatus
 * Collateral.mmStatus}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected ResponseStatusCode responseStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus1Choice#mmCode
	 * ResponseStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmResponseStatus
	 * Status1Choice.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmResponseStatus
	 * Status8Choice.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus2Choice#mmCode
	 * ResponseStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmResponseStatus
	 * Status3Choice.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmResponseStatus
	 * Status10Choice.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse1#mmResponseType
	 * OtherCollateralResponse1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#mmResponseType
	 * CashCollateralResponse1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus5Choice#mmCode
	 * ResponseStatus5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmResponseStatus
	 * Status19Choice.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmResponseStatus
	 * Status22Choice.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus7Choice#mmCode
	 * ResponseStatus7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2#mmResponseType
	 * OtherCollateralResponse2.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmResponseType
	 * CashCollateralResponse2.mmResponseType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmResponseStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ResponseStatus1Choice.mmCode, com.tools20022.repository.choice.Status1Choice.mmResponseStatus,
					com.tools20022.repository.choice.Status8Choice.mmResponseStatus, com.tools20022.repository.choice.ResponseStatus2Choice.mmCode, com.tools20022.repository.choice.Status3Choice.mmResponseStatus,
					com.tools20022.repository.choice.Status10Choice.mmResponseStatus, com.tools20022.repository.msg.OtherCollateralResponse1.mmResponseType, com.tools20022.repository.msg.CashCollateralResponse1.mmResponseType,
					com.tools20022.repository.choice.ResponseStatus5Choice.mmCode, com.tools20022.repository.choice.Status19Choice.mmResponseStatus, com.tools20022.repository.choice.Status22Choice.mmResponseStatus,
					com.tools20022.repository.choice.ResponseStatus7Choice.mmCode, com.tools20022.repository.msg.OtherCollateralResponse2.mmResponseType, com.tools20022.repository.msg.CashCollateralResponse2.mmResponseType);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResponseStatus";
			definition = "Specifies the status of the response to a collateral claim, proposal or substitution proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResponseStatusCode.mmObject();
		}
	};
	protected CollateralManagementCancellationReasonCode collateralManagementCancellationReason;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralCancellationType1Choice#mmCode
	 * CollateralCancellationType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralCancellationType1Choice#mmProprietary
	 * CollateralCancellationType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationReason1#mmCancellationReasonCode
	 * CollateralCancellationReason1.mmCancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#mmRejectionDetails
	 * CollateralCancellationStatus1.mmRejectionDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCollateralManagementCancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralCancellationType1Choice.mmCode, com.tools20022.repository.choice.CollateralCancellationType1Choice.mmProprietary,
					com.tools20022.repository.msg.CollateralCancellationReason1.mmCancellationReasonCode, com.tools20022.repository.msg.CollateralCancellationStatus1.mmRejectionDetails);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralManagementCancellationReason";
			definition = "Specifies the reason for the cancellation of a message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralManagementCancellationReasonCode.mmObject();
		}
	};
	protected CollateralSubstitutionConfirmationCode substitutionStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1#mmConfirmationType
	 * CollateralConfirmation1.mmConfirmationType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSubstitutionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralConfirmation1.mmConfirmationType);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubstitutionStatus";
			definition = "Provides details about the status of the collateral substitution, either released or returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionConfirmationCode.mmObject();
		}
	};
	protected InterestRejectionReasonCode interestRejectionReason;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason21FormatChoice#mmCode
	 * RejectionReason21FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason21FormatChoice#mmProprietary
	 * RejectionReason21FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1#mmRejectionReason
	 * InterestResponse1.mmRejectionReason}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmInterestRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RejectionReason21FormatChoice.mmCode, com.tools20022.repository.choice.RejectionReason21FormatChoice.mmProprietary,
					com.tools20022.repository.msg.InterestResponse1.mmRejectionReason);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestRejectionReason";
			definition = "Provides the interest rejection reason using an ISO 20022 code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRejectionReasonCode.mmObject();
		}
	};
	protected MarginCallResponseCode marginCallResponse;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseType1Choice#mmCode
	 * ResponseType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseType1Choice#mmProprietary
	 * ResponseType1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmMarginCallResponse = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ResponseType1Choice.mmCode, com.tools20022.repository.choice.ResponseType1Choice.mmProprietary);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginCallResponse";
			definition = "Specifies whether the margin call request was sent on a non valuation day or was received after notification time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarginCallResponseCode.mmObject();
		}
	};
	protected SettlementStatusCode settlement;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmSettlementStatus
	 * CollateralValuation1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmSettlementStatus
	 * CollateralValuation2.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmSettlementStatus
	 * CollateralValuation5.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValuation1.mmSettlementStatus, com.tools20022.repository.msg.CollateralValuation2.mmSettlementStatus,
					com.tools20022.repository.msg.CollateralValuation5.mmSettlementStatus);
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Provides the settlement status of the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatusCode.mmObject();
		}
	};
	protected CancellationReasonCode cancellationReason;
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
	public static final MMBusinessAttribute mmCancellationReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Provides details about the status of the collateral cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}
	};
	protected Collateral collateral;
	/**
	 * Collateral for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmStatus
	 * Collateral.mmStatus}</li>
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
	public static final MMBusinessAssociationEnd mmCollateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Collateral for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralStatus";
				definition = "Specifies the status of the collateral or of an event related to collateral.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.mmStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralStatus.mmResponseStatus, com.tools20022.repository.entity.CollateralStatus.mmCollateralManagementCancellationReason,
						com.tools20022.repository.entity.CollateralStatus.mmSubstitutionStatus, com.tools20022.repository.entity.CollateralStatus.mmInterestRejectionReason,
						com.tools20022.repository.entity.CollateralStatus.mmMarginCallResponse, com.tools20022.repository.entity.CollateralStatus.mmSettlement, com.tools20022.repository.entity.CollateralStatus.mmCancellationReason,
						com.tools20022.repository.entity.CollateralStatus.mmCollateral);
				derivationComponent_lazy = () -> Arrays.asList(CollateralCancellationType1Choice.mmObject(), CollateralCancellationReason1.mmObject(), RejectionStatus2.mmObject(), CollateralCancellationStatus1.mmObject(),
						CollateralProposalResponseType1.mmObject(), CollateralConfirmation1.mmObject(), InterestResponse1.mmObject(), CollateralStatusReason1.mmObject(), OtherCollateralResponse1.mmObject(),
						CashCollateralResponse1.mmObject(), SecuritiesCollateralResponse1.mmObject(), OtherCollateralResponse2.mmObject(), CashCollateralResponse2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ResponseStatusCode getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatusCode responseStatus) {
		this.responseStatus = responseStatus;
	}

	public CollateralManagementCancellationReasonCode getCollateralManagementCancellationReason() {
		return collateralManagementCancellationReason;
	}

	public void setCollateralManagementCancellationReason(CollateralManagementCancellationReasonCode collateralManagementCancellationReason) {
		this.collateralManagementCancellationReason = collateralManagementCancellationReason;
	}

	public CollateralSubstitutionConfirmationCode getSubstitutionStatus() {
		return substitutionStatus;
	}

	public void setSubstitutionStatus(CollateralSubstitutionConfirmationCode substitutionStatus) {
		this.substitutionStatus = substitutionStatus;
	}

	public InterestRejectionReasonCode getInterestRejectionReason() {
		return interestRejectionReason;
	}

	public void setInterestRejectionReason(InterestRejectionReasonCode interestRejectionReason) {
		this.interestRejectionReason = interestRejectionReason;
	}

	public MarginCallResponseCode getMarginCallResponse() {
		return marginCallResponse;
	}

	public void setMarginCallResponse(MarginCallResponseCode marginCallResponse) {
		this.marginCallResponse = marginCallResponse;
	}

	public SettlementStatusCode getSettlement() {
		return settlement;
	}

	public void setSettlement(SettlementStatusCode settlement) {
		this.settlement = settlement;
	}

	public CancellationReasonCode getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(CancellationReasonCode cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public Collateral getCollateral() {
		return collateral;
	}

	public void setCollateral(com.tools20022.repository.entity.Collateral collateral) {
		this.collateral = collateral;
	}
}