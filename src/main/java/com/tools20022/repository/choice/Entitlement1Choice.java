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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.MeetingEntitlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of entitlement calculation method.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Entitlement1Choice#mmEntitlementRatio
 * Entitlement1Choice.mmEntitlementRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Entitlement1Choice#mmEntitlementDescription
 * Entitlement1Choice.mmEntitlementDescription}</li>
 * </ul>
 * </li>
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
 * "Entitlement1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of entitlement calculation method."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Entitlement1Choice", propOrder = {"entitlementRatio", "entitlementDescription"})
public class Entitlement1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected DecimalNumber entitlementRatio;
	/**
	 * Number of votes assigned to one security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEntitlementRatio
	 * MeetingEntitlement.mmEntitlementRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Entitlement1Choice
	 * Entitlement1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes assigned to one security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementRatio = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingEntitlement.mmEntitlementRatio;
			componentContext_lazy = () -> Entitlement1Choice.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementRatio";
			definition = "Number of votes assigned to one security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected Max35Text entitlementDescription;
	/**
	 * Specifies the calculation method of the number of votes assigned to one
	 * security. This element should be used when the entitlement calculation
	 * rule is complex.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Entitlement1Choice
	 * Entitlement1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the calculation method of the number of votes assigned to one security. This element should be used when the entitlement calculation rule is complex."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementDescription = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> MeetingEntitlement.mmObject();
			componentContext_lazy = () -> Entitlement1Choice.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementDescription";
			definition = "Specifies the calculation method of the number of votes assigned to one security. This element should be used when the entitlement calculation rule is complex.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Entitlement1Choice.mmEntitlementRatio, Entitlement1Choice.mmEntitlementDescription);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Entitlement1Choice";
				definition = "Choice of entitlement calculation method.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "EntitlmntRatio", required = true)
	public DecimalNumber getEntitlementRatio() {
		return entitlementRatio;
	}

	public void setEntitlementRatio(DecimalNumber entitlementRatio) {
		this.entitlementRatio = entitlementRatio;
	}

	@XmlElement(name = "EntitlmntDesc", required = true)
	public Max35Text getEntitlementDescription() {
		return entitlementDescription;
	}

	public void setEntitlementDescription(Max35Text entitlementDescription) {
		this.entitlementDescription = entitlementDescription;
	}
}