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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PendingStatusReason1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification36;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats for pending reason code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatusReason2Choice#mmCode
 * PendingStatusReason2Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatusReason2Choice#mmProprietary
 * PendingStatusReason2Choice.mmProprietary}</li>
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
 * "PendingStatusReason2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for pending reason code."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingOpeningStatusReason2Choice
 * PendingOpeningStatusReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedStatusReason1Choice
 * AcceptedStatusReason1Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.DisabledStatusReason2Choice
 * DisabledStatusReason2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PendingStatusReason2Choice", propOrder = {"code", "proprietary"})
public class PendingStatusReason2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected PendingStatusReason1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code
	 * PendingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatusReason2Choice
	 * PendingStatusReason2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the pending account status expressed as a code."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingOpeningStatusReason2Choice#mmCode
	 * PendingOpeningStatusReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatusReason1Choice#mmCode
	 * AcceptedStatusReason1Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DisabledStatusReason2Choice#mmCode
	 * DisabledStatusReason2Choice.mmCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PendingStatusReason2Choice, PendingStatusReason1Code> mmCode = new MMMessageAttribute<PendingStatusReason2Choice, PendingStatusReason1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PendingStatusReason2Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Reason for the pending account status expressed as a code.";
			nextVersions_lazy = () -> Arrays.asList(PendingOpeningStatusReason2Choice.mmCode, AcceptedStatusReason1Choice.mmCode);
			previousVersion_lazy = () -> DisabledStatusReason2Choice.mmCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingStatusReason1Code.mmObject();
		}

		@Override
		public PendingStatusReason1Code getValue(PendingStatusReason2Choice obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(PendingStatusReason2Choice obj, PendingStatusReason1Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification36 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36
	 * GenericIdentification36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatusReason2Choice
	 * PendingStatusReason2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the pending account status expressed as a proprietary code."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingOpeningStatusReason2Choice#mmProprietary
	 * PendingOpeningStatusReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatusReason1Choice#mmProprietary
	 * AcceptedStatusReason1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DisabledStatusReason2Choice#mmProprietary
	 * DisabledStatusReason2Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PendingStatusReason2Choice, GenericIdentification36> mmProprietary = new MMMessageAssociationEnd<PendingStatusReason2Choice, GenericIdentification36>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PendingStatusReason2Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Reason for the pending account status expressed as a proprietary code.";
			nextVersions_lazy = () -> Arrays.asList(PendingOpeningStatusReason2Choice.mmProprietary, AcceptedStatusReason1Choice.mmProprietary);
			previousVersion_lazy = () -> DisabledStatusReason2Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification36.mmObject();
		}

		@Override
		public GenericIdentification36 getValue(PendingStatusReason2Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(PendingStatusReason2Choice obj, GenericIdentification36 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PendingStatusReason2Choice.mmCode, com.tools20022.repository.choice.PendingStatusReason2Choice.mmProprietary);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingStatusReason2Choice";
				definition = "Choice of formats for pending reason code.";
				nextVersions_lazy = () -> Arrays.asList(PendingOpeningStatusReason2Choice.mmObject(), AcceptedStatusReason1Choice.mmObject());
				previousVersion_lazy = () -> DisabledStatusReason2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PendingStatusReason1Code getCode() {
		return code;
	}

	public PendingStatusReason2Choice setCode(PendingStatusReason1Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public GenericIdentification36 getProprietary() {
		return proprietary;
	}

	public PendingStatusReason2Choice setProprietary(GenericIdentification36 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}