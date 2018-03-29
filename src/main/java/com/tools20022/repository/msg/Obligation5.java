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
import com.tools20022.repository.area.colr.CollateralProposalResponseV05;
import com.tools20022.repository.area.colr.CollateralProposalV05;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification100Choice;
import com.tools20022.repository.codeset.ExposureType5Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralAccount3;
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
 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmPartyA
 * Obligation5.mmPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmServicingPartyA
 * Obligation5.mmServicingPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmPartyB
 * Obligation5.mmPartyB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmServicingPartyB
 * Obligation5.mmServicingPartyB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Obligation5#mmCollateralAccountIdentification
 * Obligation5.mmCollateralAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmExposureType
 * Obligation5.mmExposureType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmValuationDate
 * Obligation5.mmValuationDate}</li>
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
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalResponseV05#mmObligation
 * CollateralProposalResponseV05.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV05#mmObligation
 * CollateralProposalV05.mmObligation}</li>
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
 * "Obligation5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Obligation4
 * Obligation4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Obligation5", propOrder = {"partyA", "servicingPartyA", "partyB", "servicingPartyB", "collateralAccountIdentification", "exposureType", "valuationDate"})
public class Obligation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyA", required = true)
	protected PartyIdentification100Choice partyA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation5 Obligation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmPartyA
	 * Obligation4.mmPartyA}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Obligation5, PartyIdentification100Choice> mmPartyA = new MMMessageAssociationEnd<Obligation5, PartyIdentification100Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation5.mmObject();
			isDerived = false;
			xmlTag = "PtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyA";
			definition = "Defines one of the entities associated with the collateral agreement.";
			previousVersion_lazy = () -> Obligation4.mmPartyA;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
		}

		@Override
		public PartyIdentification100Choice getValue(Obligation5 obj) {
			return obj.getPartyA();
		}

		@Override
		public void setValue(Obligation5 obj, PartyIdentification100Choice value) {
			obj.setPartyA(value);
		}
	};
	@XmlElement(name = "SvcgPtyA")
	protected PartyIdentification100Choice servicingPartyA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation5 Obligation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmServicingPartyA
	 * Obligation4.mmServicingPartyA}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Obligation5, Optional<PartyIdentification100Choice>> mmServicingPartyA = new MMMessageAssociationEnd<Obligation5, Optional<PartyIdentification100Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation5.mmObject();
			isDerived = false;
			xmlTag = "SvcgPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicingPartyA";
			definition = "Specifies the party that is acting on behalf of party A and that offers collateral management services.";
			previousVersion_lazy = () -> Obligation4.mmServicingPartyA;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification100Choice> getValue(Obligation5 obj) {
			return obj.getServicingPartyA();
		}

		@Override
		public void setValue(Obligation5 obj, Optional<PartyIdentification100Choice> value) {
			obj.setServicingPartyA(value.orElse(null));
		}
	};
	@XmlElement(name = "PtyB", required = true)
	protected PartyIdentification100Choice partyB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation5 Obligation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmPartyB
	 * Obligation4.mmPartyB}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Obligation5, PartyIdentification100Choice> mmPartyB = new MMMessageAssociationEnd<Obligation5, PartyIdentification100Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation5.mmObject();
			isDerived = false;
			xmlTag = "PtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyB";
			definition = "Defines the other entity associated with the collateral agreement.";
			previousVersion_lazy = () -> Obligation4.mmPartyB;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
		}

		@Override
		public PartyIdentification100Choice getValue(Obligation5 obj) {
			return obj.getPartyB();
		}

		@Override
		public void setValue(Obligation5 obj, PartyIdentification100Choice value) {
			obj.setPartyB(value);
		}
	};
	@XmlElement(name = "SvcgPtyB")
	protected PartyIdentification100Choice servicingPartyB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation5 Obligation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmServicingPartyB
	 * Obligation4.mmServicingPartyB}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Obligation5, Optional<PartyIdentification100Choice>> mmServicingPartyB = new MMMessageAssociationEnd<Obligation5, Optional<PartyIdentification100Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation5.mmObject();
			isDerived = false;
			xmlTag = "SvcgPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicingPartyB";
			definition = "Specifies the party that is acting on behalf of party B and that offers collateral management services.";
			previousVersion_lazy = () -> Obligation4.mmServicingPartyB;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification100Choice> getValue(Obligation5 obj) {
			return obj.getServicingPartyB();
		}

		@Override
		public void setValue(Obligation5 obj, Optional<PartyIdentification100Choice> value) {
			obj.setServicingPartyB(value.orElse(null));
		}
	};
	@XmlElement(name = "CollAcctId")
	protected CollateralAccount3 collateralAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount3
	 * CollateralAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
	 * Collateral.mmCollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation5 Obligation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmCollateralAccountIdentification
	 * Obligation4.mmCollateralAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Obligation5, Optional<CollateralAccount3>> mmCollateralAccountIdentification = new MMMessageAttribute<Obligation5, Optional<CollateralAccount3>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation5.mmObject();
			isDerived = false;
			xmlTag = "CollAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAccountIdentification";
			definition = "Provides additional information on the collateral account of the party delivering/receiving the collateral.";
			previousVersion_lazy = () -> Obligation4.mmCollateralAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CollateralAccount3.mmObject();
		}

		@Override
		public Optional<CollateralAccount3> getValue(Obligation5 obj) {
			return obj.getCollateralAccountIdentification();
		}

		@Override
		public void setValue(Obligation5 obj, Optional<CollateralAccount3> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Obligation5 Obligation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmExposureType
	 * Obligation4.mmExposureType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Obligation5, Optional<ExposureType5Code>> mmExposureType = new MMMessageAttribute<Obligation5, Optional<ExposureType5Code>>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation5.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area or type of trade causing the collateral movement.";
			previousVersion_lazy = () -> Obligation4.mmExposureType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExposureType5Code.mmObject();
		}

		@Override
		public Optional<ExposureType5Code> getValue(Obligation5 obj) {
			return obj.getExposureType();
		}

		@Override
		public void setValue(Obligation5 obj, Optional<ExposureType5Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Obligation5 Obligation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmValuationDate
	 * Obligation4.mmValuationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Obligation5, DateAndDateTimeChoice> mmValuationDate = new MMMessageAttribute<Obligation5, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarginCallValuationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Obligation5.mmObject();
			isDerived = false;
			xmlTag = "ValtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDate";
			definition = "Indicates the close of business date on which the initiating party is valuing the margin call.";
			previousVersion_lazy = () -> Obligation4.mmValuationDate;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(Obligation5 obj) {
			return obj.getValuationDate();
		}

		@Override
		public void setValue(Obligation5 obj, DateAndDateTimeChoice value) {
			obj.setValuationDate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation5.mmPartyA, com.tools20022.repository.msg.Obligation5.mmServicingPartyA, com.tools20022.repository.msg.Obligation5.mmPartyB,
						com.tools20022.repository.msg.Obligation5.mmServicingPartyB, com.tools20022.repository.msg.Obligation5.mmCollateralAccountIdentification, com.tools20022.repository.msg.Obligation5.mmExposureType,
						com.tools20022.repository.msg.Obligation5.mmValuationDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralProposalResponseV05.mmObligation, CollateralProposalV05.mmObligation);
				trace_lazy = () -> CollateralAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Obligation5";
				definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
				previousVersion_lazy = () -> Obligation4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification100Choice getPartyA() {
		return partyA;
	}

	public Obligation5 setPartyA(PartyIdentification100Choice partyA) {
		this.partyA = Objects.requireNonNull(partyA);
		return this;
	}

	public Optional<PartyIdentification100Choice> getServicingPartyA() {
		return servicingPartyA == null ? Optional.empty() : Optional.of(servicingPartyA);
	}

	public Obligation5 setServicingPartyA(PartyIdentification100Choice servicingPartyA) {
		this.servicingPartyA = servicingPartyA;
		return this;
	}

	public PartyIdentification100Choice getPartyB() {
		return partyB;
	}

	public Obligation5 setPartyB(PartyIdentification100Choice partyB) {
		this.partyB = Objects.requireNonNull(partyB);
		return this;
	}

	public Optional<PartyIdentification100Choice> getServicingPartyB() {
		return servicingPartyB == null ? Optional.empty() : Optional.of(servicingPartyB);
	}

	public Obligation5 setServicingPartyB(PartyIdentification100Choice servicingPartyB) {
		this.servicingPartyB = servicingPartyB;
		return this;
	}

	public Optional<CollateralAccount3> getCollateralAccountIdentification() {
		return collateralAccountIdentification == null ? Optional.empty() : Optional.of(collateralAccountIdentification);
	}

	public Obligation5 setCollateralAccountIdentification(CollateralAccount3 collateralAccountIdentification) {
		this.collateralAccountIdentification = collateralAccountIdentification;
		return this;
	}

	public Optional<ExposureType5Code> getExposureType() {
		return exposureType == null ? Optional.empty() : Optional.of(exposureType);
	}

	public Obligation5 setExposureType(ExposureType5Code exposureType) {
		this.exposureType = exposureType;
		return this;
	}

	public DateAndDateTimeChoice getValuationDate() {
		return valuationDate;
	}

	public Obligation5 setValuationDate(DateAndDateTimeChoice valuationDate) {
		this.valuationDate = Objects.requireNonNull(valuationDate);
		return this;
	}
}