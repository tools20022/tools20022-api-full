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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification33Choice;
import com.tools20022.repository.codeset.ExposureType1Code;
import com.tools20022.repository.entity.CollateralAgreement;
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.Obligation1#mmPartyA
 * Obligation1.mmPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation1#mmServicingPartyA
 * Obligation1.mmServicingPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation1#mmPartyB
 * Obligation1.mmPartyB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation1#mmServicingPartyB
 * Obligation1.mmServicingPartyB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation1#mmExposureType
 * Obligation1.mmExposureType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation1#mmValuationDate
 * Obligation1.mmValuationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
 * CollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Obligation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Obligation1", propOrder = {"partyA", "servicingPartyA", "partyB", "servicingPartyB", "exposureType", "valuationDate"})
public class Obligation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification33Choice partyA;
	/**
	 * Defines one of the entities associated with the collateral agreement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Obligation1 Obligation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartyA = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Obligation1.mmObject();
			isDerived = false;
			xmlTag = "PtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyA";
			definition = "Defines one of the entities associated with the collateral agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification33Choice.mmObject();
		}
	};
	protected PartyIdentification33Choice servicingPartyA;
	/**
	 * Party that is acting on behalf of party A and that offers collateral
	 * management services.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Obligation1 Obligation1}</li>
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
	 * "Party that is acting on behalf of party A and that offers collateral management services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServicingPartyA = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Obligation1.mmObject();
			isDerived = false;
			xmlTag = "SvcgPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicingPartyA";
			definition = "Party that is acting on behalf of party A and that offers collateral management services.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification33Choice.mmObject();
		}
	};
	protected PartyIdentification33Choice partyB;
	/**
	 * Defines the other entity associated with the collateral agreement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Obligation1 Obligation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartyB = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Obligation1.mmObject();
			isDerived = false;
			xmlTag = "PtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyB";
			definition = "Defines the other entity associated with the collateral agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification33Choice.mmObject();
		}
	};
	protected PartyIdentification33Choice servicingPartyB;
	/**
	 * Party that is acting on behalf of party B and that offers collateral
	 * management services.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Obligation1 Obligation1}</li>
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
	 * "Party that is acting on behalf of party B and that offers collateral management services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServicingPartyB = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Obligation1.mmObject();
			isDerived = false;
			xmlTag = "SvcgPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicingPartyB";
			definition = "Party that is acting on behalf of party B and that offers collateral management services.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification33Choice.mmObject();
		}
	};
	protected ExposureType1Code exposureType;
	/**
	 * Specifies the underlying business area/type of trade causing the
	 * collateral movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
	 * ExposureTerm.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation1 Obligation1}</li>
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
	 * "Specifies the underlying business area/type of trade causing the collateral movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExposureType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> Obligation1.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExposureType1Code.mmObject();
		}
	};
	protected DateAndDateTimeChoice valuationDate;
	/**
	 * Close of business date that initiating party is valuing the margin call.
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
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarginCallValuationDate
	 * MarginCall.mmMarginCallValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation1 Obligation1}</li>
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
	 * "Close of business date that initiating party is valuing the margin call."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarginCallValuationDate;
			componentContext_lazy = () -> Obligation1.mmObject();
			isDerived = false;
			xmlTag = "ValtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDate";
			definition = "Close of business date that initiating party is valuing the margin call.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Obligation1.mmPartyA, Obligation1.mmServicingPartyA, Obligation1.mmPartyB, Obligation1.mmServicingPartyB, Obligation1.mmExposureType, Obligation1.mmValuationDate);
				trace_lazy = () -> CollateralAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Obligation1";
				definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PtyA", required = true)
	public PartyIdentification33Choice getPartyA() {
		return partyA;
	}

	public void setPartyA(PartyIdentification33Choice partyA) {
		this.partyA = partyA;
	}

	@XmlElement(name = "SvcgPtyA")
	public PartyIdentification33Choice getServicingPartyA() {
		return servicingPartyA;
	}

	public void setServicingPartyA(PartyIdentification33Choice servicingPartyA) {
		this.servicingPartyA = servicingPartyA;
	}

	@XmlElement(name = "PtyB", required = true)
	public PartyIdentification33Choice getPartyB() {
		return partyB;
	}

	public void setPartyB(PartyIdentification33Choice partyB) {
		this.partyB = partyB;
	}

	@XmlElement(name = "SvcgPtyB")
	public PartyIdentification33Choice getServicingPartyB() {
		return servicingPartyB;
	}

	public void setServicingPartyB(PartyIdentification33Choice servicingPartyB) {
		this.servicingPartyB = servicingPartyB;
	}

	@XmlElement(name = "XpsrTp")
	public ExposureType1Code getExposureType() {
		return exposureType;
	}

	public void setExposureType(ExposureType1Code exposureType) {
		this.exposureType = exposureType;
	}

	@XmlElement(name = "ValtnDt", required = true)
	public DateAndDateTimeChoice getValuationDate() {
		return valuationDate;
	}

	public void setValuationDate(DateAndDateTimeChoice valuationDate) {
		this.valuationDate = valuationDate;
	}
}