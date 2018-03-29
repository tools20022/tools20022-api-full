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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ReportLine5;
import com.tools20022.repository.msg.ReportLine6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies if breakdown is by purchase order or commercial invoice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BreakDown1Choice#mmByPurchaseOrder
 * BreakDown1Choice.mmByPurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BreakDown1Choice#mmByCommercialInvoice
 * BreakDown1Choice.mmByCommercialInvoice}</li>
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
 * "BreakDown1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if breakdown is by purchase order or commercial invoice."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BreakDown1Choice", propOrder = {"byPurchaseOrder", "byCommercialInvoice"})
public class BreakDown1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ByPurchsOrdr", required = true)
	protected ReportLine5 byPurchaseOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportLine5
	 * ReportLine5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BreakDown1Choice
	 * BreakDown1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ByPurchsOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ByPurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The intention to pay is based on a purchase order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakDown1Choice, ReportLine5> mmByPurchaseOrder = new MMMessageAssociationEnd<BreakDown1Choice, ReportLine5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.BreakDown1Choice.mmObject();
			isDerived = false;
			xmlTag = "ByPurchsOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ByPurchaseOrder";
			definition = "The intention to pay is based on a purchase order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReportLine5.mmObject();
		}

		@Override
		public ReportLine5 getValue(BreakDown1Choice obj) {
			return obj.getByPurchaseOrder();
		}

		@Override
		public void setValue(BreakDown1Choice obj, ReportLine5 value) {
			obj.setByPurchaseOrder(value);
		}
	};
	@XmlElement(name = "ByComrclInvc", required = true)
	protected ReportLine6 byCommercialInvoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportLine6
	 * ReportLine6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BreakDown1Choice
	 * BreakDown1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ByComrclInvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ByCommercialInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The intention to pay is based on a commercial invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakDown1Choice, ReportLine6> mmByCommercialInvoice = new MMMessageAssociationEnd<BreakDown1Choice, ReportLine6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.BreakDown1Choice.mmObject();
			isDerived = false;
			xmlTag = "ByComrclInvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ByCommercialInvoice";
			definition = "The intention to pay is based on a commercial invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReportLine6.mmObject();
		}

		@Override
		public ReportLine6 getValue(BreakDown1Choice obj) {
			return obj.getByCommercialInvoice();
		}

		@Override
		public void setValue(BreakDown1Choice obj, ReportLine6 value) {
			obj.setByCommercialInvoice(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BreakDown1Choice.mmByPurchaseOrder, com.tools20022.repository.choice.BreakDown1Choice.mmByCommercialInvoice);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BreakDown1Choice";
				definition = "Specifies if breakdown is by purchase order or commercial invoice.";
			}
		});
		return mmObject_lazy.get();
	}

	public ReportLine5 getByPurchaseOrder() {
		return byPurchaseOrder;
	}

	public BreakDown1Choice setByPurchaseOrder(ReportLine5 byPurchaseOrder) {
		this.byPurchaseOrder = Objects.requireNonNull(byPurchaseOrder);
		return this;
	}

	public ReportLine6 getByCommercialInvoice() {
		return byCommercialInvoice;
	}

	public BreakDown1Choice setByCommercialInvoice(ReportLine6 byCommercialInvoice) {
		this.byCommercialInvoice = Objects.requireNonNull(byCommercialInvoice);
		return this;
	}
}