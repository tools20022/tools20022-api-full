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
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.EnabledStatusReason1;
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
 * Choice of formats for an enabled status reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EnabledStatusReason1Choice#mmNoSpecifiedReason
 * EnabledStatusReason1Choice.mmNoSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EnabledStatusReason1Choice#mmReason
 * EnabledStatusReason1Choice.mmReason}</li>
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
 * "EnabledStatusReason1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for an enabled status reason."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ProformaStatusReason1Choice
 * ProformaStatusReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DisabledStatusReason1Choice
 * DisabledStatusReason1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountStatusUpdateInstructionReason1Choice
 * AccountStatusUpdateInstructionReason1Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EnabledStatusReason1Choice", propOrder = {"noSpecifiedReason", "reason"})
public class EnabledStatusReason1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NoSpcfdRsn", required = true)
	protected NoReasonCode noSpecifiedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.EnabledStatusReason1Choice
	 * EnabledStatusReason1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoSpcfdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "There is no reason available or to report for the enabled account status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProformaStatusReason1Choice#mmNoSpecifiedReason
	 * ProformaStatusReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DisabledStatusReason1Choice#mmNoSpecifiedReason
	 * DisabledStatusReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountStatusUpdateInstructionReason1Choice#mmNoSpecifiedReason
	 * AccountStatusUpdateInstructionReason1Choice.mmNoSpecifiedReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnabledStatusReason1Choice, NoReasonCode> mmNoSpecifiedReason = new MMMessageAttribute<EnabledStatusReason1Choice, NoReasonCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.EnabledStatusReason1Choice.mmObject();
			isDerived = false;
			xmlTag = "NoSpcfdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSpecifiedReason";
			definition = "There is no reason available or to report for the enabled account status.";
			nextVersions_lazy = () -> Arrays.asList(ProformaStatusReason1Choice.mmNoSpecifiedReason, DisabledStatusReason1Choice.mmNoSpecifiedReason, AccountStatusUpdateInstructionReason1Choice.mmNoSpecifiedReason);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		@Override
		public NoReasonCode getValue(EnabledStatusReason1Choice obj) {
			return obj.getNoSpecifiedReason();
		}

		@Override
		public void setValue(EnabledStatusReason1Choice obj, NoReasonCode value) {
			obj.setNoSpecifiedReason(value);
		}
	};
	@XmlElement(name = "Rsn", required = true)
	protected List<EnabledStatusReason1> reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EnabledStatusReason1
	 * EnabledStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.EnabledStatusReason1Choice
	 * EnabledStatusReason1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the enabled account status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProformaStatusReason1Choice#mmReason
	 * ProformaStatusReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DisabledStatusReason1Choice#mmReason
	 * DisabledStatusReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountStatusUpdateInstructionReason1Choice#mmReason
	 * AccountStatusUpdateInstructionReason1Choice.mmReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnabledStatusReason1Choice, List<EnabledStatusReason1>> mmReason = new MMMessageAssociationEnd<EnabledStatusReason1Choice, List<EnabledStatusReason1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.EnabledStatusReason1Choice.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the enabled account status.";
			nextVersions_lazy = () -> Arrays.asList(ProformaStatusReason1Choice.mmReason, DisabledStatusReason1Choice.mmReason, AccountStatusUpdateInstructionReason1Choice.mmReason);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnabledStatusReason1.mmObject();
		}

		@Override
		public List<EnabledStatusReason1> getValue(EnabledStatusReason1Choice obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(EnabledStatusReason1Choice obj, List<EnabledStatusReason1> value) {
			obj.setReason(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.EnabledStatusReason1Choice.mmNoSpecifiedReason, com.tools20022.repository.choice.EnabledStatusReason1Choice.mmReason);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EnabledStatusReason1Choice";
				definition = "Choice of formats for an enabled status reason.";
				nextVersions_lazy = () -> Arrays.asList(ProformaStatusReason1Choice.mmObject(), DisabledStatusReason1Choice.mmObject(), AccountStatusUpdateInstructionReason1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public NoReasonCode getNoSpecifiedReason() {
		return noSpecifiedReason;
	}

	public EnabledStatusReason1Choice setNoSpecifiedReason(NoReasonCode noSpecifiedReason) {
		this.noSpecifiedReason = Objects.requireNonNull(noSpecifiedReason);
		return this;
	}

	public List<EnabledStatusReason1> getReason() {
		return reason == null ? reason = new ArrayList<>() : reason;
	}

	public EnabledStatusReason1Choice setReason(List<EnabledStatusReason1> reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}
}