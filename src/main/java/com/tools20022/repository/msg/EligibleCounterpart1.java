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
import com.tools20022.repository.choice.EligibilityIdentification1Choice;
import com.tools20022.repository.choice.SystemPartyIdentification1Choice;
import com.tools20022.repository.codeset.EligibilityType1Code;
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Represents a party to be identified as eligible for the instructing party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1#IssuerIdentification
 * EligibleCounterpart1.IssuerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1#EligibleCounterpartIdentification
 * EligibleCounterpart1.EligibleCounterpartIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligibleCounterpart1#ValidFrom
 * EligibleCounterpart1.ValidFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligibleCounterpart1#ValidTo
 * EligibleCounterpart1.ValidTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1#EligibilityType
 * EligibleCounterpart1.EligibilityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1#EligibilityIdentification
 * EligibleCounterpart1.EligibilityIdentification}</li>
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
 * "EligibleCounterpart1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Represents a party to be identified as eligible for the instructing party."</li>
 * </ul>
 */
public class EligibleCounterpart1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique business identifier code used to identify the party providing the
	 * eligible counterpart information
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1
	 * EligibleCounterpart1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique business identifier code used to identify the party providing the eligible counterpart information"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute IssuerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EligibleCounterpart1.mmObject();
			isDerived = false;
			xmlTag = "IssrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerIdentification";
			definition = "Unique business identifier code used to identify the party providing the eligible counterpart information";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}
	};
	/**
	 * Unique business identifier code used to identify the central securities
	 * depository to be defined as eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1
	 * EligibleCounterpart1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblCntrptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCounterpartIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique business identifier code used to identify the central securities depository to be defined as eligible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute EligibleCounterpartIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EligibleCounterpart1.mmObject();
			isDerived = false;
			xmlTag = "ElgblCntrptId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleCounterpartIdentification";
			definition = "Unique business identifier code used to identify the central securities depository to be defined as eligible.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}
	};
	/**
	 * Date from when the eligible counterpart is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1
	 * EligibleCounterpart1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date from when the eligible counterpart is valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ValidFrom = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EligibleCounterpart1.mmObject();
			isDerived = false;
			xmlTag = "VldFr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidFrom";
			definition = "Date from when the eligible counterpart is valid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date until when the eligible counterpart is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1
	 * EligibleCounterpart1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date until when the eligible counterpart is valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ValidTo = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EligibleCounterpart1.mmObject();
			isDerived = false;
			xmlTag = "VldTo";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidTo";
			definition = "Date until when the eligible counterpart is valid.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Defines the type of eligibility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityType1Code
	 * EligibilityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1
	 * EligibleCounterpart1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgbltyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibilityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of eligibility."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EligibilityType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EligibleCounterpart1.mmObject();
			isDerived = false;
			xmlTag = "ElgbltyTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibilityType";
			definition = "Defines the type of eligibility.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EligibilityType1Code.mmObject();
		}
	};
	/**
	 * Unique identification of the eligible counterpart party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.EligibilityIdentification1Choice
	 * EligibilityIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1
	 * EligibleCounterpart1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgbltyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibilityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the eligible counterpart party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EligibilityIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EligibleCounterpart1.mmObject();
			isDerived = false;
			xmlTag = "ElgbltyId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibilityIdentification";
			definition = "Unique identification of the eligible counterpart party.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EligibilityIdentification1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EligibleCounterpart1.IssuerIdentification, com.tools20022.repository.msg.EligibleCounterpart1.EligibleCounterpartIdentification,
						com.tools20022.repository.msg.EligibleCounterpart1.ValidFrom, com.tools20022.repository.msg.EligibleCounterpart1.ValidTo, com.tools20022.repository.msg.EligibleCounterpart1.EligibilityType,
						com.tools20022.repository.msg.EligibleCounterpart1.EligibilityIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EligibleCounterpart1";
				definition = "Represents a party to be identified as eligible for the instructing party.";
			}
		});
		return mmObject_lazy.get();
	}
}