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
import com.tools20022.repository.choice.Quantity1Choice;
import com.tools20022.repository.entity.Leg;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additionnal details related to the leg.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1#mmLegIOIQuantity
 * InstrumentLeg1.mmLegIOIQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1#mmInstrumentLegDetails
 * InstrumentLeg1.mmInstrumentLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1#mmLegStipulations
 * InstrumentLeg1.mmLegStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1#mmLegFinancialInstrumentAttributes
 * InstrumentLeg1.mmLegFinancialInstrumentAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
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
 * "InstrumentLeg1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additionnal details related to the leg."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InstrumentLeg1", propOrder = {"legIOIQuantity", "instrumentLegDetails", "legStipulations", "legFinancialInstrumentAttributes"})
public class InstrumentLeg1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Quantity1Choice legIOIQuantity;
	/**
	 * Required for multileg IOIs and for each leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity1Choice
	 * Quantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1 InstrumentLeg1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegIOIQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegIOIQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Required for multileg IOIs and for each leg."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegIOIQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> InstrumentLeg1.mmObject();
			isDerived = false;
			xmlTag = "LegIOIQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegIOIQuantity";
			definition = "Required for multileg IOIs and for each leg.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity1Choice.mmObject();
		}
	};
	protected SecurityIdentification7 instrumentLegDetails;
	/**
	 * Provides details about the financial instrument of a particular leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1 InstrumentLeg1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmLegDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentLegDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument of a particular leg."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstrumentLegDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> InstrumentLeg1.mmObject();
			isDerived = false;
			xmlTag = "InstrmLegDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentLegDetails";
			definition = "Provides details about the financial instrument of a particular leg.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	protected FinancialInstrumentStipulations legStipulations;
	/**
	 * Provides details about the financial instrument stipulations of a
	 * particular leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1 InstrumentLeg1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegStiptns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegStipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument stipulations of a particular leg."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegStipulations = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> InstrumentLeg1.mmObject();
			isDerived = false;
			xmlTag = "LegStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegStipulations";
			definition = "Provides details about the financial instrument stipulations of a particular leg.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FinancialInstrumentAttributes1> legFinancialInstrumentAttributes;
	/**
	 * Provides details about the financial instrument attributes of a
	 * particular leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Leg#mmRelatedAsset
	 * Leg.mmRelatedAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1 InstrumentLeg1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegFinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegFinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument attributes of a particular leg."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Leg.mmRelatedAsset;
			componentContext_lazy = () -> InstrumentLeg1.mmObject();
			isDerived = false;
			xmlTag = "LegFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegFinancialInstrumentAttributes";
			definition = "Provides details about the financial instrument attributes of a particular leg.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstrumentLeg1.mmLegIOIQuantity, InstrumentLeg1.mmInstrumentLegDetails, InstrumentLeg1.mmLegStipulations, InstrumentLeg1.mmLegFinancialInstrumentAttributes);
				trace_lazy = () -> Leg.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InstrumentLeg1";
				definition = "Additionnal details related to the leg.";
				nextVersions_lazy = () -> Arrays.asList(InstrumentLeg6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LegIOIQty", required = true)
	public Quantity1Choice getLegIOIQuantity() {
		return legIOIQuantity;
	}

	public void setLegIOIQuantity(Quantity1Choice legIOIQuantity) {
		this.legIOIQuantity = legIOIQuantity;
	}

	@XmlElement(name = "InstrmLegDtls")
	public SecurityIdentification7 getInstrumentLegDetails() {
		return instrumentLegDetails;
	}

	public void setInstrumentLegDetails(com.tools20022.repository.msg.SecurityIdentification7 instrumentLegDetails) {
		this.instrumentLegDetails = instrumentLegDetails;
	}

	@XmlElement(name = "LegStiptns")
	public FinancialInstrumentStipulations getLegStipulations() {
		return legStipulations;
	}

	public void setLegStipulations(com.tools20022.repository.msg.FinancialInstrumentStipulations legStipulations) {
		this.legStipulations = legStipulations;
	}

	@XmlElement(name = "LegFinInstrmAttrbts")
	public List<FinancialInstrumentAttributes1> getLegFinancialInstrumentAttributes() {
		return legFinancialInstrumentAttributes;
	}

	public void setLegFinancialInstrumentAttributes(List<com.tools20022.repository.msg.FinancialInstrumentAttributes1> legFinancialInstrumentAttributes) {
		this.legFinancialInstrumentAttributes = legFinancialInstrumentAttributes;
	}
}