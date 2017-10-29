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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification100Choice;
import com.tools20022.repository.codeset.ExposureType5Code;
import com.tools20022.repository.entity.CollateralAgreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides information like the identification of the party or parties
 * associated with the collateral agreement, the exposure type and the valuation
 * date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#PartyA
 * Obligation4.PartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#ServicingPartyA
 * Obligation4.ServicingPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#PartyB
 * Obligation4.PartyB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#ServicingPartyB
 * Obligation4.ServicingPartyB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Obligation4#CollateralAccountIdentification
 * Obligation4.CollateralAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#ExposureType
 * Obligation4.ExposureType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#ValuationDate
 * Obligation4.ValuationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
 * CollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#Obligation
 * MarginCallRequestV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#Obligation
 * InterestPaymentResponseV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV04#Obligation
 * CollateralProposalV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallDisputeNotificationV04#Obligation
 * MarginCallDisputeNotificationV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04#Obligation
 * CollateralSubstitutionResponseV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#Obligation
 * MarginCallResponseV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV04#Obligation
 * InterestPaymentStatementV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04#Obligation
 * CollateralManagementCancellationRequestV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV04#Obligation
 * CollateralSubstitutionConfirmationV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#Obligation
 * InterestPaymentRequestV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04#Obligation
 * CollateralManagementCancellationStatusV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalResponseV04#Obligation
 * CollateralProposalResponseV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#Obligation
 * CollateralSubstitutionRequestV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#Obligation
 * CollateralAndExposureReportV03.Obligation}</li>
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
 * "Obligation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation5 Obligation5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Obligation3
 * Obligation3}</li>
 * </ul>
 */
public class Obligation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Defines one of the entities associated with the collateral agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines one of the entities associated with the collateral agreement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#PartyA
	 * Obligation5.PartyA}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3#PartyA
	 * Obligation3.PartyA}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PartyA = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Obligation4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "PtyA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyA";
			definition = "Defines one of the entities associated with the collateral agreement.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Obligation3.PartyA;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation5.PartyA);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the party that is acting on behalf of party A and that offers
	 * collateral management services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcgPtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServicingPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party that is acting on behalf of party A and that offers collateral management services."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#ServicingPartyA
	 * Obligation5.ServicingPartyA}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3#ServicingPartyA
	 * Obligation3.ServicingPartyA}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ServicingPartyA = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Obligation4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "SvcgPtyA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicingPartyA";
			definition = "Specifies the party that is acting on behalf of party A and that offers collateral management services.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Obligation3.ServicingPartyA;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation5.ServicingPartyA);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Defines the other entity associated with the collateral agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the other entity associated with the collateral agreement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#PartyB
	 * Obligation5.PartyB}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3#PartyB
	 * Obligation3.PartyB}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PartyB = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Obligation4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "PtyB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyB";
			definition = "Defines the other entity associated with the collateral agreement.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Obligation3.PartyB;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation5.PartyB);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the party that is acting on behalf of party B and that offers
	 * collateral management services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcgPtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServicingPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party that is acting on behalf of party B and that offers collateral management services."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#ServicingPartyB
	 * Obligation5.ServicingPartyB}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3#ServicingPartyB
	 * Obligation3.ServicingPartyB}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ServicingPartyB = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Obligation4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "SvcgPtyB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicingPartyB";
			definition = "Specifies the party that is acting on behalf of party B and that offers collateral management services.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Obligation3.ServicingPartyB;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation5.ServicingPartyB);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides additional information on the collateral account of the party
	 * delivering/receiving the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount2
	 * CollateralAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAccount
	 * Collateral.CollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the collateral account of the party delivering/receiving the collateral."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#CollateralAccountIdentification
	 * Obligation5.CollateralAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3#CollateralAccountIdentification
	 * Obligation3.CollateralAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CollateralAccountIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Obligation4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralAccount;
			isDerived = false;
			xmlTag = "CollAcctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAccountIdentification";
			definition = "Provides additional information on the collateral account of the party delivering/receiving the collateral.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Obligation3.CollateralAccountIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation5.CollateralAccountIdentification);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> CollateralAccount2.mmObject();
		}
	};
	/**
	 * Specifies the underlying business area or type of trade causing the
	 * collateral movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#ExposureType
	 * ExposureTerm.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area or type of trade causing the collateral movement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#ExposureType
	 * Obligation5.ExposureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3#ExposureType
	 * Obligation3.ExposureType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExposureType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Obligation4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ExposureTerm.ExposureType;
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area or type of trade causing the collateral movement.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Obligation3.ExposureType;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation5.ExposureType);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ExposureType5Code.mmObject();
		}
	};
	/**
	 * Indicates the close of business date on which the initiating party is
	 * valuing the margin call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#MarginCallValuationDate
	 * MarginCall.MarginCallValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the close of business date on which the initiating party is valuing the margin call."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#ValuationDate
	 * Obligation5.ValuationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3#ValuationDate
	 * Obligation3.ValuationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ValuationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Obligation4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.MarginCall.MarginCallValuationDate;
			isDerived = false;
			xmlTag = "ValtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDate";
			definition = "Indicates the close of business date on which the initiating party is valuing the margin call.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Obligation3.ValuationDate;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation5.ValuationDate);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation4.PartyA, com.tools20022.repository.msg.Obligation4.ServicingPartyA, com.tools20022.repository.msg.Obligation4.PartyB,
						com.tools20022.repository.msg.Obligation4.ServicingPartyB, com.tools20022.repository.msg.Obligation4.CollateralAccountIdentification, com.tools20022.repository.msg.Obligation4.ExposureType,
						com.tools20022.repository.msg.Obligation4.ValuationDate);
				trace_lazy = () -> CollateralAgreement.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.MarginCallRequestV04.Obligation, com.tools20022.repository.area.colr.InterestPaymentResponseV04.Obligation,
						com.tools20022.repository.area.colr.CollateralProposalV04.Obligation, com.tools20022.repository.area.colr.MarginCallDisputeNotificationV04.Obligation,
						com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04.Obligation, com.tools20022.repository.area.colr.MarginCallResponseV04.Obligation,
						com.tools20022.repository.area.colr.InterestPaymentStatementV04.Obligation, com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04.Obligation,
						com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV04.Obligation, com.tools20022.repository.area.colr.InterestPaymentRequestV04.Obligation,
						com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04.Obligation, com.tools20022.repository.area.colr.CollateralProposalResponseV04.Obligation,
						com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04.Obligation, com.tools20022.repository.area.colr.CollateralAndExposureReportV03.Obligation);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Obligation4";
				definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
				previousVersion_lazy = () -> Obligation3.mmObject();
				nextVersions_lazy = () -> Arrays.asList(Obligation5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}