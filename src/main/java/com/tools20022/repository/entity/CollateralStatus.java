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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the status of the collateral or of an event related to collateral.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralStatus" src="doc-files/CollateralStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of the collateral or of an event related to collateral."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CollateralStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ResponseStatusCode responseStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the response to a collateral claim, proposal or substitution proposal."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralStatus, ResponseStatusCode> mmResponseStatus = new MMBusinessAttribute<CollateralStatus, ResponseStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ResponseStatus1Choice.mmCode, Status1Choice.mmResponseStatus, Status8Choice.mmResponseStatus, ResponseStatus2Choice.mmCode, Status3Choice.mmResponseStatus, Status10Choice.mmResponseStatus,
					OtherCollateralResponse1.mmResponseType, CashCollateralResponse1.mmResponseType, ResponseStatus5Choice.mmCode, Status19Choice.mmResponseStatus, Status22Choice.mmResponseStatus, ResponseStatus7Choice.mmCode,
					OtherCollateralResponse2.mmResponseType, CashCollateralResponse2.mmResponseType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResponseStatus";
			definition = "Specifies the status of the response to a collateral claim, proposal or substitution proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResponseStatusCode.mmObject();
		}

		@Override
		public ResponseStatusCode getValue(CollateralStatus obj) {
			return obj.getResponseStatus();
		}

		@Override
		public void setValue(CollateralStatus obj, ResponseStatusCode value) {
			obj.setResponseStatus(value);
		}
	};
	protected CollateralManagementCancellationReasonCode collateralManagementCancellationReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagementCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the cancellation of a message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralStatus, CollateralManagementCancellationReasonCode> mmCollateralManagementCancellationReason = new MMBusinessAttribute<CollateralStatus, CollateralManagementCancellationReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralCancellationType1Choice.mmCode, CollateralCancellationType1Choice.mmProprietary, CollateralCancellationReason1.mmCancellationReasonCode,
					CollateralCancellationStatus1.mmRejectionDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralManagementCancellationReason";
			definition = "Specifies the reason for the cancellation of a message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralManagementCancellationReasonCode.mmObject();
		}

		@Override
		public CollateralManagementCancellationReasonCode getValue(CollateralStatus obj) {
			return obj.getCollateralManagementCancellationReason();
		}

		@Override
		public void setValue(CollateralStatus obj, CollateralManagementCancellationReasonCode value) {
			obj.setCollateralManagementCancellationReason(value);
		}
	};
	protected CollateralSubstitutionConfirmationCode substitutionStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1#mmConfirmationType
	 * CollateralConfirmation1.mmConfirmationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the status of the collateral substitution, either released or returned."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralStatus, CollateralSubstitutionConfirmationCode> mmSubstitutionStatus = new MMBusinessAttribute<CollateralStatus, CollateralSubstitutionConfirmationCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralConfirmation1.mmConfirmationType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubstitutionStatus";
			definition = "Provides details about the status of the collateral substitution, either released or returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionConfirmationCode.mmObject();
		}

		@Override
		public CollateralSubstitutionConfirmationCode getValue(CollateralStatus obj) {
			return obj.getSubstitutionStatus();
		}

		@Override
		public void setValue(CollateralStatus obj, CollateralSubstitutionConfirmationCode value) {
			obj.setSubstitutionStatus(value);
		}
	};
	protected InterestRejectionReasonCode interestRejectionReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the interest rejection reason using an ISO 20022 code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralStatus, InterestRejectionReasonCode> mmInterestRejectionReason = new MMBusinessAttribute<CollateralStatus, InterestRejectionReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RejectionReason21FormatChoice.mmCode, RejectionReason21FormatChoice.mmProprietary, InterestResponse1.mmRejectionReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestRejectionReason";
			definition = "Provides the interest rejection reason using an ISO 20022 code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRejectionReasonCode.mmObject();
		}

		@Override
		public InterestRejectionReasonCode getValue(CollateralStatus obj) {
			return obj.getInterestRejectionReason();
		}

		@Override
		public void setValue(CollateralStatus obj, InterestRejectionReasonCode value) {
			obj.setInterestRejectionReason(value);
		}
	};
	protected MarginCallResponseCode marginCallResponse;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.ResponseType1Choice#mmCode
	 * ResponseType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseType1Choice#mmProprietary
	 * ResponseType1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the margin call request was sent on a non valuation day or was received after notification time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralStatus, MarginCallResponseCode> mmMarginCallResponse = new MMBusinessAttribute<CollateralStatus, MarginCallResponseCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ResponseType1Choice.mmCode, ResponseType1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginCallResponse";
			definition = "Specifies whether the margin call request was sent on a non valuation day or was received after notification time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarginCallResponseCode.mmObject();
		}

		@Override
		public MarginCallResponseCode getValue(CollateralStatus obj) {
			return obj.getMarginCallResponse();
		}

		@Override
		public void setValue(CollateralStatus obj, MarginCallResponseCode value) {
			obj.setMarginCallResponse(value);
		}
	};
	protected SettlementStatusCode settlement;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the settlement status of the collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralStatus, SettlementStatusCode> mmSettlement = new MMBusinessAttribute<CollateralStatus, SettlementStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralValuation1.mmSettlementStatus, CollateralValuation2.mmSettlementStatus, CollateralValuation5.mmSettlementStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Provides the settlement status of the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatusCode.mmObject();
		}

		@Override
		public SettlementStatusCode getValue(CollateralStatus obj) {
			return obj.getSettlement();
		}

		@Override
		public void setValue(CollateralStatus obj, SettlementStatusCode value) {
			obj.setSettlement(value);
		}
	};
	protected CancellationReasonCode cancellationReason;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the status of the collateral cancellation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralStatus, CancellationReasonCode> mmCancellationReason = new MMBusinessAttribute<CollateralStatus, CancellationReasonCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Provides details about the status of the collateral cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}

		@Override
		public CancellationReasonCode getValue(CollateralStatus obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(CollateralStatus obj, CancellationReasonCode value) {
			obj.setCancellationReason(value);
		}
	};
	protected Collateral collateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmStatus
	 * Collateral.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral for which a status is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralStatus, Optional<Collateral>> mmCollateral = new MMBusinessAssociationEnd<CollateralStatus, Optional<Collateral>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Collateral for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}

		@Override
		public Optional<Collateral> getValue(CollateralStatus obj) {
			return obj.getCollateral();
		}

		@Override
		public void setValue(CollateralStatus obj, Optional<Collateral> value) {
			obj.setCollateral(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
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

			@Override
			public Class<?> getInstanceClass() {
				return CollateralStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ResponseStatusCode getResponseStatus() {
		return responseStatus;
	}

	public CollateralStatus setResponseStatus(ResponseStatusCode responseStatus) {
		this.responseStatus = Objects.requireNonNull(responseStatus);
		return this;
	}

	public CollateralManagementCancellationReasonCode getCollateralManagementCancellationReason() {
		return collateralManagementCancellationReason;
	}

	public CollateralStatus setCollateralManagementCancellationReason(CollateralManagementCancellationReasonCode collateralManagementCancellationReason) {
		this.collateralManagementCancellationReason = Objects.requireNonNull(collateralManagementCancellationReason);
		return this;
	}

	public CollateralSubstitutionConfirmationCode getSubstitutionStatus() {
		return substitutionStatus;
	}

	public CollateralStatus setSubstitutionStatus(CollateralSubstitutionConfirmationCode substitutionStatus) {
		this.substitutionStatus = Objects.requireNonNull(substitutionStatus);
		return this;
	}

	public InterestRejectionReasonCode getInterestRejectionReason() {
		return interestRejectionReason;
	}

	public CollateralStatus setInterestRejectionReason(InterestRejectionReasonCode interestRejectionReason) {
		this.interestRejectionReason = Objects.requireNonNull(interestRejectionReason);
		return this;
	}

	public MarginCallResponseCode getMarginCallResponse() {
		return marginCallResponse;
	}

	public CollateralStatus setMarginCallResponse(MarginCallResponseCode marginCallResponse) {
		this.marginCallResponse = Objects.requireNonNull(marginCallResponse);
		return this;
	}

	public SettlementStatusCode getSettlement() {
		return settlement;
	}

	public CollateralStatus setSettlement(SettlementStatusCode settlement) {
		this.settlement = Objects.requireNonNull(settlement);
		return this;
	}

	public CancellationReasonCode getCancellationReason() {
		return cancellationReason;
	}

	public CollateralStatus setCancellationReason(CancellationReasonCode cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}

	public Optional<Collateral> getCollateral() {
		return collateral == null ? Optional.empty() : Optional.of(collateral);
	}

	public CollateralStatus setCollateral(com.tools20022.repository.entity.Collateral collateral) {
		this.collateral = collateral;
		return this;
	}
}