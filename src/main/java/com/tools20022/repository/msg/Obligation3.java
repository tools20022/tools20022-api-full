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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.colr.*;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification33Choice;
import com.tools20022.repository.codeset.ExposureType5Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralAccount1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * <li>{@linkplain com.tools20022.repository.msg.Obligation3#mmPartyA
 * Obligation3.mmPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation3#mmServicingPartyA
 * Obligation3.mmServicingPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation3#mmPartyB
 * Obligation3.mmPartyB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation3#mmServicingPartyB
 * Obligation3.mmServicingPartyB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Obligation3#mmCollateralAccountIdentification
 * Obligation3.mmCollateralAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation3#mmExposureType
 * Obligation3.mmExposureType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation3#mmValuationDate
 * Obligation3.mmValuationDate}</li>
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
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03#mmObligation
 * CollateralSubstitutionRequestV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV03#mmObligation
 * InterestPaymentStatementV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#mmObligation
 * CollateralAndExposureReportV02.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmObligation
 * MarginCallResponseV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV03#mmObligation
 * CollateralManagementCancellationStatusV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalResponseV03#mmObligation
 * CollateralProposalResponseV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmObligation
 * MarginCallRequestV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV03#mmObligation
 * CollateralProposalV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallDisputeNotificationV03#mmObligation
 * MarginCallDisputeNotificationV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV03#mmObligation
 * CollateralManagementCancellationRequestV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03#mmObligation
 * CollateralSubstitutionResponseV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmObligation
 * InterestPaymentResponseV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV03#mmObligation
 * InterestPaymentRequestV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV03#mmObligation
 * CollateralSubstitutionConfirmationV03.mmObligation}</li>
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
 * "Obligation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Obligation2
 * Obligation2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Obligation3", propOrder = {"partyA", "servicingPartyA", "partyB", "servicingPartyB", "collateralAccountIdentification", "exposureType", "valuationDate"})
public class Obligation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyA", required = true)
	protected PartyIdentification33Choice partyA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
	 * PartyIdentification33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3 Obligation3}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmPartyA
	 * Obligation4.mmPartyA}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation2#mmPartyA
	 * Obligation2.mmPartyA}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Obligation3, PartyIdentification33Choice> mmPartyA = new MMMessageAssociationEnd<Obligation3, PartyIdentification33Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation3.mmObject();
			isDerived = false;
			xmlTag = "PtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyA";
			definition = "Defines one of the entities associated with the collateral agreement.";
			nextVersions_lazy = () -> Arrays.asList(Obligation4.mmPartyA);
			previousVersion_lazy = () -> Obligation2.mmPartyA;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification33Choice.mmObject();
		}

		@Override
		public PartyIdentification33Choice getValue(Obligation3 obj) {
			return obj.getPartyA();
		}

		@Override
		public void setValue(Obligation3 obj, PartyIdentification33Choice value) {
			obj.setPartyA(value);
		}
	};
	@XmlElement(name = "SvcgPtyA")
	protected PartyIdentification33Choice servicingPartyA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
	 * PartyIdentification33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3 Obligation3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmServicingPartyA
	 * Obligation4.mmServicingPartyA}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation2#mmServicingPartyA
	 * Obligation2.mmServicingPartyA}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Obligation3, Optional<PartyIdentification33Choice>> mmServicingPartyA = new MMMessageAssociationEnd<Obligation3, Optional<PartyIdentification33Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation3.mmObject();
			isDerived = false;
			xmlTag = "SvcgPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicingPartyA";
			definition = "Specifies the party that is acting on behalf of party A and that offers collateral management services.";
			nextVersions_lazy = () -> Arrays.asList(Obligation4.mmServicingPartyA);
			previousVersion_lazy = () -> Obligation2.mmServicingPartyA;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification33Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification33Choice> getValue(Obligation3 obj) {
			return obj.getServicingPartyA();
		}

		@Override
		public void setValue(Obligation3 obj, Optional<PartyIdentification33Choice> value) {
			obj.setServicingPartyA(value.orElse(null));
		}
	};
	@XmlElement(name = "PtyB", required = true)
	protected PartyIdentification33Choice partyB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
	 * PartyIdentification33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3 Obligation3}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmPartyB
	 * Obligation4.mmPartyB}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation2#mmPartyB
	 * Obligation2.mmPartyB}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Obligation3, PartyIdentification33Choice> mmPartyB = new MMMessageAssociationEnd<Obligation3, PartyIdentification33Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation3.mmObject();
			isDerived = false;
			xmlTag = "PtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyB";
			definition = "Defines the other entity associated with the collateral agreement.";
			nextVersions_lazy = () -> Arrays.asList(Obligation4.mmPartyB);
			previousVersion_lazy = () -> Obligation2.mmPartyB;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification33Choice.mmObject();
		}

		@Override
		public PartyIdentification33Choice getValue(Obligation3 obj) {
			return obj.getPartyB();
		}

		@Override
		public void setValue(Obligation3 obj, PartyIdentification33Choice value) {
			obj.setPartyB(value);
		}
	};
	@XmlElement(name = "SvcgPtyB")
	protected PartyIdentification33Choice servicingPartyB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
	 * PartyIdentification33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3 Obligation3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmServicingPartyB
	 * Obligation4.mmServicingPartyB}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation2#mmServicingPartyB
	 * Obligation2.mmServicingPartyB}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Obligation3, Optional<PartyIdentification33Choice>> mmServicingPartyB = new MMMessageAssociationEnd<Obligation3, Optional<PartyIdentification33Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation3.mmObject();
			isDerived = false;
			xmlTag = "SvcgPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicingPartyB";
			definition = "Specifies the party that is acting on behalf of party B and that offers collateral management services.";
			nextVersions_lazy = () -> Arrays.asList(Obligation4.mmServicingPartyB);
			previousVersion_lazy = () -> Obligation2.mmServicingPartyB;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification33Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification33Choice> getValue(Obligation3 obj) {
			return obj.getServicingPartyB();
		}

		@Override
		public void setValue(Obligation3 obj, Optional<PartyIdentification33Choice> value) {
			obj.setServicingPartyB(value.orElse(null));
		}
	};
	@XmlElement(name = "CollAcctId")
	protected CollateralAccount1 collateralAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount1
	 * CollateralAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
	 * Collateral.mmCollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3 Obligation3}</li>
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
	 * "Provides additional information on the Collateral Account of the Party delivering the collateral."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmCollateralAccountIdentification
	 * Obligation4.mmCollateralAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation2#mmCollateralAccountIdentification
	 * Obligation2.mmCollateralAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Obligation3, Optional<CollateralAccount1>> mmCollateralAccountIdentification = new MMMessageAttribute<Obligation3, Optional<CollateralAccount1>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation3.mmObject();
			isDerived = false;
			xmlTag = "CollAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAccountIdentification";
			definition = "Provides additional information on the Collateral Account of the Party delivering the collateral.";
			nextVersions_lazy = () -> Arrays.asList(Obligation4.mmCollateralAccountIdentification);
			previousVersion_lazy = () -> Obligation2.mmCollateralAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CollateralAccount1.mmObject();
		}

		@Override
		public Optional<CollateralAccount1> getValue(Obligation3 obj) {
			return obj.getCollateralAccountIdentification();
		}

		@Override
		public void setValue(Obligation3 obj, Optional<CollateralAccount1> value) {
			obj.setCollateralAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "XpsrTp")
	protected ExposureType5Code exposureType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
	 * ExposureTerm.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3 Obligation3}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmExposureType
	 * Obligation4.mmExposureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation2#mmExposureType
	 * Obligation2.mmExposureType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Obligation3, Optional<ExposureType5Code>> mmExposureType = new MMMessageAttribute<Obligation3, Optional<ExposureType5Code>>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation3.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area or type of trade causing the collateral movement.";
			nextVersions_lazy = () -> Arrays.asList(Obligation4.mmExposureType);
			previousVersion_lazy = () -> Obligation2.mmExposureType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExposureType5Code.mmObject();
		}

		@Override
		public Optional<ExposureType5Code> getValue(Obligation3 obj) {
			return obj.getExposureType();
		}

		@Override
		public void setValue(Obligation3 obj, Optional<ExposureType5Code> value) {
			obj.setExposureType(value.orElse(null));
		}
	};
	@XmlElement(name = "ValtnDt", required = true)
	protected DateAndDateTimeChoice valuationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarginCallValuationDate
	 * MarginCall.mmMarginCallValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation3 Obligation3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmValuationDate
	 * Obligation4.mmValuationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation2#mmValuationDate
	 * Obligation2.mmValuationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Obligation3, DateAndDateTimeChoice> mmValuationDate = new MMMessageAttribute<Obligation3, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarginCallValuationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation3.mmObject();
			isDerived = false;
			xmlTag = "ValtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDate";
			definition = "Indicates the close of business date on which the initiating party is valuing the margin call.";
			nextVersions_lazy = () -> Arrays.asList(Obligation4.mmValuationDate);
			previousVersion_lazy = () -> Obligation2.mmValuationDate;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(Obligation3 obj) {
			return obj.getValuationDate();
		}

		@Override
		public void setValue(Obligation3 obj, DateAndDateTimeChoice value) {
			obj.setValuationDate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation3.mmPartyA, com.tools20022.repository.msg.Obligation3.mmServicingPartyA, com.tools20022.repository.msg.Obligation3.mmPartyB,
						com.tools20022.repository.msg.Obligation3.mmServicingPartyB, com.tools20022.repository.msg.Obligation3.mmCollateralAccountIdentification, com.tools20022.repository.msg.Obligation3.mmExposureType,
						com.tools20022.repository.msg.Obligation3.mmValuationDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV03.mmObligation, InterestPaymentStatementV03.mmObligation, CollateralAndExposureReportV02.mmObligation, MarginCallResponseV03.mmObligation,
						CollateralManagementCancellationStatusV03.mmObligation, CollateralProposalResponseV03.mmObligation, MarginCallRequestV03.mmObligation, CollateralProposalV03.mmObligation,
						MarginCallDisputeNotificationV03.mmObligation, CollateralManagementCancellationRequestV03.mmObligation, CollateralSubstitutionResponseV03.mmObligation, InterestPaymentResponseV03.mmObligation,
						InterestPaymentRequestV03.mmObligation, CollateralSubstitutionConfirmationV03.mmObligation);
				trace_lazy = () -> CollateralAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Obligation3";
				definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
				nextVersions_lazy = () -> Arrays.asList(Obligation4.mmObject());
				previousVersion_lazy = () -> Obligation2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification33Choice getPartyA() {
		return partyA;
	}

	public Obligation3 setPartyA(PartyIdentification33Choice partyA) {
		this.partyA = Objects.requireNonNull(partyA);
		return this;
	}

	public Optional<PartyIdentification33Choice> getServicingPartyA() {
		return servicingPartyA == null ? Optional.empty() : Optional.of(servicingPartyA);
	}

	public Obligation3 setServicingPartyA(PartyIdentification33Choice servicingPartyA) {
		this.servicingPartyA = servicingPartyA;
		return this;
	}

	public PartyIdentification33Choice getPartyB() {
		return partyB;
	}

	public Obligation3 setPartyB(PartyIdentification33Choice partyB) {
		this.partyB = Objects.requireNonNull(partyB);
		return this;
	}

	public Optional<PartyIdentification33Choice> getServicingPartyB() {
		return servicingPartyB == null ? Optional.empty() : Optional.of(servicingPartyB);
	}

	public Obligation3 setServicingPartyB(PartyIdentification33Choice servicingPartyB) {
		this.servicingPartyB = servicingPartyB;
		return this;
	}

	public Optional<CollateralAccount1> getCollateralAccountIdentification() {
		return collateralAccountIdentification == null ? Optional.empty() : Optional.of(collateralAccountIdentification);
	}

	public Obligation3 setCollateralAccountIdentification(CollateralAccount1 collateralAccountIdentification) {
		this.collateralAccountIdentification = collateralAccountIdentification;
		return this;
	}

	public Optional<ExposureType5Code> getExposureType() {
		return exposureType == null ? Optional.empty() : Optional.of(exposureType);
	}

	public Obligation3 setExposureType(ExposureType5Code exposureType) {
		this.exposureType = exposureType;
		return this;
	}

	public DateAndDateTimeChoice getValuationDate() {
		return valuationDate;
	}

	public Obligation3 setValuationDate(DateAndDateTimeChoice valuationDate) {
		this.valuationDate = Objects.requireNonNull(valuationDate);
		return this;
	}
}