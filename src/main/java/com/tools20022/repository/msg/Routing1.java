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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RoutingType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification23;
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
 * Firms or vendor maintained list of identifiers for the purpose of message
 * routing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Routing1#mmList
 * Routing1.mmList}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Routing1#mmFirm
 * Routing1.mmFirm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Routing1#mmRoutingType
 * Routing1.mmRoutingType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: 216</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Routing1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Firms or vendor maintained list of identifiers for the purpose of message routing."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Routing1", propOrder = {"list", "firm", "routingType"})
public class Routing1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "List")
	protected List<Max35Text> list;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Routing1
	 * Routing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "List"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 217</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "List"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a list of firms or a vendor maintained list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Routing1, List<Max35Text>> mmList = new MMMessageAttribute<Routing1, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Routing1.mmObject();
			isDerived = false;
			xmlTag = "List";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "217"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "List";
			definition = "Identifies a list of firms or a vendor maintained list.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(Routing1 obj) {
			return obj.getList();
		}

		@Override
		public void setValue(Routing1 obj, List<Max35Text> value) {
			obj.setList(value);
		}
	};
	@XmlElement(name = "Firm")
	protected List<PartyIdentification23> firm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification23
	 * PartyIdentification23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Routing1
	 * Routing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Firm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 217</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Firm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Routing1, List<PartyIdentification23>> mmFirm = new MMMessageAttribute<Routing1, List<PartyIdentification23>>() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Routing1.mmObject();
			isDerived = false;
			xmlTag = "Firm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "217"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Firm";
			definition = "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification23.mmObject();
		}

		@Override
		public List<PartyIdentification23> getValue(Routing1 obj) {
			return obj.getFirm();
		}

		@Override
		public void setValue(Routing1 obj, List<PartyIdentification23> value) {
			obj.setFirm(value);
		}
	};
	@XmlElement(name = "RtgTp", required = true)
	protected RoutingType1Code routingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoutingType1Code
	 * RoutingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Routing1
	 * Routing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 216</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoutingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the type of routing is allowed or blocked."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Routing1, RoutingType1Code> mmRoutingType = new MMMessageAttribute<Routing1, RoutingType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Routing1.mmObject();
			isDerived = false;
			xmlTag = "RtgTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "216"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoutingType";
			definition = "Indicates if the type of routing is allowed or blocked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoutingType1Code.mmObject();
		}

		@Override
		public RoutingType1Code getValue(Routing1 obj) {
			return obj.getRoutingType();
		}

		@Override
		public void setValue(Routing1 obj, RoutingType1Code value) {
			obj.setRoutingType(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Routing1.mmList, com.tools20022.repository.msg.Routing1.mmFirm, com.tools20022.repository.msg.Routing1.mmRoutingType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "216"));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Routing1";
				definition = "Firms or vendor maintained list of identifiers for the purpose of message routing.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max35Text> getList() {
		return list == null ? list = new ArrayList<>() : list;
	}

	public Routing1 setList(List<Max35Text> list) {
		this.list = Objects.requireNonNull(list);
		return this;
	}

	public List<PartyIdentification23> getFirm() {
		return firm == null ? firm = new ArrayList<>() : firm;
	}

	public Routing1 setFirm(List<PartyIdentification23> firm) {
		this.firm = Objects.requireNonNull(firm);
		return this;
	}

	public RoutingType1Code getRoutingType() {
		return routingType;
	}

	public Routing1 setRoutingType(RoutingType1Code routingType) {
		this.routingType = Objects.requireNonNull(routingType);
		return this;
	}
}