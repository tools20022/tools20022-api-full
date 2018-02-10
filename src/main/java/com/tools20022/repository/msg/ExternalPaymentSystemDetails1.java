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
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * Information about external payment system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExternalPaymentSystemDetails1#mmClearingPositionsRegisterAllowedIndicator
 * ExternalPaymentSystemDetails1.mmClearingPositionsRegisterAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExternalPaymentSystemDetails1#mmClearingCircuits
 * ExternalPaymentSystemDetails1.mmClearingCircuits}</li>
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
 * "ExternalPaymentSystemDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about external payment system."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExternalPaymentSystemDetails1", propOrder = {"clearingPositionsRegisterAllowedIndicator", "clearingCircuits"})
public class ExternalPaymentSystemDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClrPossRegrAllwdInd", required = true)
	protected YesNoIndicator clearingPositionsRegisterAllowedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExternalPaymentSystemDetails1
	 * ExternalPaymentSystemDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrPossRegrAllwdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingPositionsRegisterAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the participant can send Register  of Clearing Positions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingPositionsRegisterAllowedIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExternalPaymentSystemDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClrPossRegrAllwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingPositionsRegisterAllowedIndicator";
			definition = "Indicates whether the participant can send Register  of Clearing Positions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "ClrCrcts", required = true)
	protected List<com.tools20022.repository.msg.ClearingCircuits1> clearingCircuits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExternalPaymentSystemDetails1
	 * ExternalPaymentSystemDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrCrcts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingCircuits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of the clearing schemes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingCircuits = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExternalPaymentSystemDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClrCrcts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingCircuits";
			definition = "List of the clearing schemes.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ClearingCircuits1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExternalPaymentSystemDetails1.mmClearingPositionsRegisterAllowedIndicator,
						com.tools20022.repository.msg.ExternalPaymentSystemDetails1.mmClearingCircuits);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExternalPaymentSystemDetails1";
				definition = "Information about external payment system.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getClearingPositionsRegisterAllowedIndicator() {
		return clearingPositionsRegisterAllowedIndicator;
	}

	public ExternalPaymentSystemDetails1 setClearingPositionsRegisterAllowedIndicator(YesNoIndicator clearingPositionsRegisterAllowedIndicator) {
		this.clearingPositionsRegisterAllowedIndicator = Objects.requireNonNull(clearingPositionsRegisterAllowedIndicator);
		return this;
	}

	public List<ClearingCircuits1> getClearingCircuits() {
		return clearingCircuits == null ? clearingCircuits = new ArrayList<>() : clearingCircuits;
	}

	public ExternalPaymentSystemDetails1 setClearingCircuits(List<com.tools20022.repository.msg.ClearingCircuits1> clearingCircuits) {
		this.clearingCircuits = Objects.requireNonNull(clearingCircuits);
		return this;
	}
}