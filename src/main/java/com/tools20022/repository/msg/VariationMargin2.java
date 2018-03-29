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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Amount2;
import com.tools20022.repository.msg.TotalVariationMargin1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmTotalVariationMargin
 * VariationMargin2.mmTotalVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmTotalMarkToMarket
 * VariationMargin2.mmTotalMarkToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmMarkToMarketNetted
 * VariationMargin2.mmMarkToMarketNetted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmMarkToMarketGross
 * VariationMargin2.mmMarkToMarketGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmMarkToMarketFails
 * VariationMargin2.mmMarkToMarketFails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmFailsHaircut
 * VariationMargin2.mmFailsHaircut}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VariationMargin2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Margin required to cover the risk because of the price fluctuations occurred on the unsettled exposures towards central counterparty."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "VariationMargin2", propOrder = {"totalVariationMargin", "totalMarkToMarket", "markToMarketNetted", "markToMarketGross", "markToMarketFails", "failsHaircut"})
public class VariationMargin2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlVartnMrgn", required = true)
	protected List<TotalVariationMargin1> totalVariationMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalVariationMargin1
	 * TotalVariationMargin1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2
	 * VariationMargin2}</li>
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
	public static final MMMessageAssociationEnd<VariationMargin2, List<TotalVariationMargin1>> mmTotalVariationMargin = new MMMessageAssociationEnd<VariationMargin2, List<TotalVariationMargin1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin2.mmObject();
			isDerived = false;
			xmlTag = "TtlVartnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalVariationMargin";
			definition = "Margin required to cover the risk because of the price fluctuations occurred on the unsettled exposures towards the central counterparty.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TotalVariationMargin1.mmObject();
		}

		@Override
		public List<TotalVariationMargin1> getValue(VariationMargin2 obj) {
			return obj.getTotalVariationMargin();
		}

		@Override
		public void setValue(VariationMargin2 obj, List<TotalVariationMargin1> value) {
			obj.setTotalVariationMargin(value);
		}
	};
	@XmlElement(name = "TtlMrkToMkt", required = true)
	protected Amount2 totalMarkToMarket;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2
	 * VariationMargin2}</li>
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
	public static final MMMessageAssociationEnd<VariationMargin2, Amount2> mmTotalMarkToMarket = new MMMessageAssociationEnd<VariationMargin2, Amount2>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmTotalMarkToMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin2.mmObject();
			isDerived = false;
			xmlTag = "TtlMrkToMkt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarkToMarket";
			definition = "Net unrealised profit or loss on the value of the netted, gross and failing positions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Amount2.mmObject();
		}

		@Override
		public Amount2 getValue(VariationMargin2 obj) {
			return obj.getTotalMarkToMarket();
		}

		@Override
		public void setValue(VariationMargin2 obj, Amount2 value) {
			obj.setTotalMarkToMarket(value);
		}
	};
	@XmlElement(name = "MrkToMktNetd")
	protected List<Amount2> markToMarketNetted;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2
	 * VariationMargin2}</li>
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
	public static final MMMessageAssociationEnd<VariationMargin2, List<Amount2>> mmMarkToMarketNetted = new MMMessageAssociationEnd<VariationMargin2, List<Amount2>>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarkToMarketNetted;
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin2.mmObject();
			isDerived = false;
			xmlTag = "MrkToMktNetd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketNetted";
			definition = "Unrealised net loss calculated at the participant portfolio level.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Amount2.mmObject();
		}

		@Override
		public List<Amount2> getValue(VariationMargin2 obj) {
			return obj.getMarkToMarketNetted();
		}

		@Override
		public void setValue(VariationMargin2 obj, List<Amount2> value) {
			obj.setMarkToMarketNetted(value);
		}
	};
	@XmlElement(name = "MrkToMktGrss")
	protected List<Amount2> markToMarketGross;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2
	 * VariationMargin2}</li>
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
	public static final MMMessageAssociationEnd<VariationMargin2, List<Amount2>> mmMarkToMarketGross = new MMMessageAssociationEnd<VariationMargin2, List<Amount2>>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarkToMarketGross;
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin2.mmObject();
			isDerived = false;
			xmlTag = "MrkToMktGrss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketGross";
			definition = "Unrealised net loss calculated in that market/boundary.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Amount2.mmObject();
		}

		@Override
		public List<Amount2> getValue(VariationMargin2 obj) {
			return obj.getMarkToMarketGross();
		}

		@Override
		public void setValue(VariationMargin2 obj, List<Amount2> value) {
			obj.setMarkToMarketGross(value);
		}
	};
	@XmlElement(name = "MrkToMktFls")
	protected List<Amount2> markToMarketFails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2
	 * VariationMargin2}</li>
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
	public static final MMMessageAssociationEnd<VariationMargin2, List<Amount2>> mmMarkToMarketFails = new MMMessageAssociationEnd<VariationMargin2, List<Amount2>>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarkToMarketFails;
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin2.mmObject();
			isDerived = false;
			xmlTag = "MrkToMktFls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketFails";
			definition = "Sum of the unrealised loss without taking profit into consideration.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Amount2.mmObject();
		}

		@Override
		public List<Amount2> getValue(VariationMargin2 obj) {
			return obj.getMarkToMarketFails();
		}

		@Override
		public void setValue(VariationMargin2 obj, List<Amount2> value) {
			obj.setMarkToMarketFails(value);
		}
	};
	@XmlElement(name = "FlsHrcut", required = true)
	protected Amount2 failsHaircut;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2
	 * VariationMargin2}</li>
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
	public static final MMMessageAssociationEnd<VariationMargin2, Amount2> mmFailsHaircut = new MMMessageAssociationEnd<VariationMargin2, Amount2>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmFailsHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin2.mmObject();
			isDerived = false;
			xmlTag = "FlsHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailsHaircut";
			definition = "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Amount2.mmObject();
		}

		@Override
		public Amount2 getValue(VariationMargin2 obj) {
			return obj.getFailsHaircut();
		}

		@Override
		public void setValue(VariationMargin2 obj, Amount2 value) {
			obj.setFailsHaircut(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMargin2.mmTotalVariationMargin, com.tools20022.repository.msg.VariationMargin2.mmTotalMarkToMarket,
						com.tools20022.repository.msg.VariationMargin2.mmMarkToMarketNetted, com.tools20022.repository.msg.VariationMargin2.mmMarkToMarketGross, com.tools20022.repository.msg.VariationMargin2.mmMarkToMarketFails,
						com.tools20022.repository.msg.VariationMargin2.mmFailsHaircut);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "VariationMargin2";
				definition = "Margin required to cover the risk because of the price fluctuations occurred on the unsettled exposures towards central counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<TotalVariationMargin1> getTotalVariationMargin() {
		return totalVariationMargin == null ? totalVariationMargin = new ArrayList<>() : totalVariationMargin;
	}

	public VariationMargin2 setTotalVariationMargin(List<TotalVariationMargin1> totalVariationMargin) {
		this.totalVariationMargin = Objects.requireNonNull(totalVariationMargin);
		return this;
	}

	public Amount2 getTotalMarkToMarket() {
		return totalMarkToMarket;
	}

	public VariationMargin2 setTotalMarkToMarket(Amount2 totalMarkToMarket) {
		this.totalMarkToMarket = Objects.requireNonNull(totalMarkToMarket);
		return this;
	}

	public List<Amount2> getMarkToMarketNetted() {
		return markToMarketNetted == null ? markToMarketNetted = new ArrayList<>() : markToMarketNetted;
	}

	public VariationMargin2 setMarkToMarketNetted(List<Amount2> markToMarketNetted) {
		this.markToMarketNetted = Objects.requireNonNull(markToMarketNetted);
		return this;
	}

	public List<Amount2> getMarkToMarketGross() {
		return markToMarketGross == null ? markToMarketGross = new ArrayList<>() : markToMarketGross;
	}

	public VariationMargin2 setMarkToMarketGross(List<Amount2> markToMarketGross) {
		this.markToMarketGross = Objects.requireNonNull(markToMarketGross);
		return this;
	}

	public List<Amount2> getMarkToMarketFails() {
		return markToMarketFails == null ? markToMarketFails = new ArrayList<>() : markToMarketFails;
	}

	public VariationMargin2 setMarkToMarketFails(List<Amount2> markToMarketFails) {
		this.markToMarketFails = Objects.requireNonNull(markToMarketFails);
		return this;
	}

	public Amount2 getFailsHaircut() {
		return failsHaircut;
	}

	public VariationMargin2 setFailsHaircut(Amount2 failsHaircut) {
		this.failsHaircut = Objects.requireNonNull(failsHaircut);
		return this;
	}
}