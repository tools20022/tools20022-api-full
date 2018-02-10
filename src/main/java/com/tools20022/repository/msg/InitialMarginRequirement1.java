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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
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
 * Liability and assets that arise for a clearing member with respect to a
 * central counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InitialMarginRequirement1#mmInitialMarginExposure
 * InitialMarginRequirement1.mmInitialMarginExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InitialMarginRequirement1#mmCredit
 * InitialMarginRequirement1.mmCredit}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InitialMarginRequirement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Liability and assets that arise for a clearing member with respect to a central counterparty."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InitialMarginRequirement1", propOrder = {"initialMarginExposure", "credit"})
public class InitialMarginRequirement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InitlMrgnXpsr", required = true)
	protected List<com.tools20022.repository.msg.InitialMarginExposure1> initialMarginExposure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InitialMarginExposure1
	 * InitialMarginExposure1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InitialMarginRequirement1
	 * InitialMarginRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlMrgnXpsr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMarginExposure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Liability a clearing member has to a central counterparty with respect to potential future exposures."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitialMarginExposure = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InitialMarginRequirement1.mmObject();
			isDerived = false;
			xmlTag = "InitlMrgnXpsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMarginExposure";
			definition = "Liability a clearing member has to a central counterparty with respect to potential future exposures.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InitialMarginExposure1.mmObject();
		}
	};
	@XmlElement(name = "Cdt", required = true)
	protected ActiveCurrencyAndAmount credit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InitialMarginRequirement1
	 * InitialMarginRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of any credits offsetable against initial margin requirements at the end of day. For example, net liquidating value of option positions, contingent variation margin, delivery credits.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCredit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InitialMarginRequirement1.mmObject();
			isDerived = false;
			xmlTag = "Cdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			definition = "Total value of any credits offsetable against initial margin requirements at the end of day. For example, net liquidating value of option positions, contingent variation margin, delivery credits.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InitialMarginRequirement1.mmInitialMarginExposure, com.tools20022.repository.msg.InitialMarginRequirement1.mmCredit);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InitialMarginRequirement1";
				definition = "Liability and assets that arise for a clearing member with respect to a central counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<InitialMarginExposure1> getInitialMarginExposure() {
		return initialMarginExposure == null ? initialMarginExposure = new ArrayList<>() : initialMarginExposure;
	}

	public InitialMarginRequirement1 setInitialMarginExposure(List<com.tools20022.repository.msg.InitialMarginExposure1> initialMarginExposure) {
		this.initialMarginExposure = Objects.requireNonNull(initialMarginExposure);
		return this;
	}

	public ActiveCurrencyAndAmount getCredit() {
		return credit;
	}

	public InitialMarginRequirement1 setCredit(ActiveCurrencyAndAmount credit) {
		this.credit = Objects.requireNonNull(credit);
		return this;
	}
}