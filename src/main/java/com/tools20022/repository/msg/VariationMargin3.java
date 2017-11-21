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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.MarginCall;
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
 * Margin required to cover the risk because of the price fluctuations occurred
 * on the unsettled exposures towards central counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmFinancialInstrumentIdentification
 * VariationMargin3.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmTotalVariationMargin
 * VariationMargin3.mmTotalVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmTotalMarkToMarket
 * VariationMargin3.mmTotalMarkToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmMarkToMarketNetted
 * VariationMargin3.mmMarkToMarketNetted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmMarkToMarketGross
 * VariationMargin3.mmMarkToMarketGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmMarkToMarketFails
 * VariationMargin3.mmMarkToMarketFails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmFailsHaircut
 * VariationMargin3.mmFailsHaircut}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
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
 * "VariationMargin3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Margin required to cover the risk because of the price fluctuations occurred on the unsettled exposures towards central counterparty."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "VariationMargin3", propOrder = {"financialInstrumentIdentification", "totalVariationMargin", "totalMarkToMarket", "markToMarketNetted", "markToMarketGross", "markToMarketFails", "failsHaircut"})
public class VariationMargin3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * Provides details about the security identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3
	 * VariationMargin3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the security identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> VariationMargin3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Provides details about the security identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TotalVariationMargin1> totalVariationMargin;
	/**
	 * Margin required to cover the risk because of the price fluctuations
	 * occurred on the unsettled exposures towards the central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalVariationMargin1
	 * TotalVariationMargin1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3
	 * VariationMargin3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlVartnMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalVariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required to cover the risk because of the price fluctuations occurred on the unsettled exposures towards the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalVariationMargin = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VariationMargin3.mmObject();
			isDerived = false;
			xmlTag = "TtlVartnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalVariationMargin";
			definition = "Margin required to cover the risk because of the price fluctuations occurred on the unsettled exposures towards the central counterparty.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TotalVariationMargin1.mmObject();
		}
	};
	protected Amount2 totalMarkToMarket;
	/**
	 * Net unrealised profit or loss on the value of the netted, gross and
	 * failing positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount2 Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmTotalMarkToMarket
	 * MarginCall.mmTotalMarkToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3
	 * VariationMargin3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlMrkToMkt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalMarkToMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net unrealised profit or loss on the value of the netted, gross and failing positions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalMarkToMarket = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmTotalMarkToMarket;
			componentContext_lazy = () -> VariationMargin3.mmObject();
			isDerived = false;
			xmlTag = "TtlMrkToMkt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarkToMarket";
			definition = "Net unrealised profit or loss on the value of the netted, gross and failing positions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Amount2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Amount2> markToMarketNetted;
	/**
	 * Unrealised net loss calculated at the participant portfolio level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount2 Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarkToMarketNetted
	 * MarginCall.mmMarkToMarketNetted}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3
	 * VariationMargin3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrkToMktNetd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketNetted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrealised net loss calculated at the participant portfolio level."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarkToMarketNetted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarkToMarketNetted;
			componentContext_lazy = () -> VariationMargin3.mmObject();
			isDerived = false;
			xmlTag = "MrkToMktNetd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketNetted";
			definition = "Unrealised net loss calculated at the participant portfolio level.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Amount2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Amount2> markToMarketGross;
	/**
	 * Unrealised net loss calculated in that market/boundary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount2 Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarkToMarketGross
	 * MarginCall.mmMarkToMarketGross}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3
	 * VariationMargin3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrkToMktGrss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrealised net loss calculated in that market/boundary."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarkToMarketGross = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarkToMarketGross;
			componentContext_lazy = () -> VariationMargin3.mmObject();
			isDerived = false;
			xmlTag = "MrkToMktGrss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketGross";
			definition = "Unrealised net loss calculated in that market/boundary.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Amount2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Amount2> markToMarketFails;
	/**
	 * Sum of the unrealised loss without taking profit into consideration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount2 Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarkToMarketFails
	 * MarginCall.mmMarkToMarketFails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3
	 * VariationMargin3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrkToMktFls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketFails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the unrealised loss without taking profit into consideration."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarkToMarketFails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarkToMarketFails;
			componentContext_lazy = () -> VariationMargin3.mmObject();
			isDerived = false;
			xmlTag = "MrkToMktFls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketFails";
			definition = "Sum of the unrealised loss without taking profit into consideration.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Amount2.mmObject();
		}
	};
	protected Amount2 failsHaircut;
	/**
	 * Haircut applied to the absolute value of the participants net positions.
	 * Calculation depends on a participants credit rating.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount2 Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmFailsHaircut
	 * MarginCall.mmFailsHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3
	 * VariationMargin3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlsHrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailsHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFailsHaircut = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmFailsHaircut;
			componentContext_lazy = () -> VariationMargin3.mmObject();
			isDerived = false;
			xmlTag = "FlsHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailsHaircut";
			definition = "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Amount2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(VariationMargin3.mmFinancialInstrumentIdentification, VariationMargin3.mmTotalVariationMargin, VariationMargin3.mmTotalMarkToMarket, VariationMargin3.mmMarkToMarketNetted,
						VariationMargin3.mmMarkToMarketGross, VariationMargin3.mmMarkToMarketFails, VariationMargin3.mmFailsHaircut);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VariationMargin3";
				definition = "Margin required to cover the risk because of the price fluctuations occurred on the unsettled exposures towards central counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstrmId")
	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "TtlVartnMrgn", required = true)
	public List<TotalVariationMargin1> getTotalVariationMargin() {
		return totalVariationMargin;
	}

	public void setTotalVariationMargin(List<com.tools20022.repository.msg.TotalVariationMargin1> totalVariationMargin) {
		this.totalVariationMargin = totalVariationMargin;
	}

	@XmlElement(name = "TtlMrkToMkt", required = true)
	public Amount2 getTotalMarkToMarket() {
		return totalMarkToMarket;
	}

	public void setTotalMarkToMarket(com.tools20022.repository.msg.Amount2 totalMarkToMarket) {
		this.totalMarkToMarket = totalMarkToMarket;
	}

	@XmlElement(name = "MrkToMktNetd")
	public List<Amount2> getMarkToMarketNetted() {
		return markToMarketNetted;
	}

	public void setMarkToMarketNetted(List<com.tools20022.repository.msg.Amount2> markToMarketNetted) {
		this.markToMarketNetted = markToMarketNetted;
	}

	@XmlElement(name = "MrkToMktGrss")
	public List<Amount2> getMarkToMarketGross() {
		return markToMarketGross;
	}

	public void setMarkToMarketGross(List<com.tools20022.repository.msg.Amount2> markToMarketGross) {
		this.markToMarketGross = markToMarketGross;
	}

	@XmlElement(name = "MrkToMktFls")
	public List<Amount2> getMarkToMarketFails() {
		return markToMarketFails;
	}

	public void setMarkToMarketFails(List<com.tools20022.repository.msg.Amount2> markToMarketFails) {
		this.markToMarketFails = markToMarketFails;
	}

	@XmlElement(name = "FlsHrcut")
	public Amount2 getFailsHaircut() {
		return failsHaircut;
	}

	public void setFailsHaircut(com.tools20022.repository.msg.Amount2 failsHaircut) {
		this.failsHaircut = failsHaircut;
	}
}