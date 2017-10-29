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
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.msg.EnabledStatusReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.choice.EnabledStatusReason1Choice#NoSpecifiedReason
 * EnabledStatusReason1Choice.NoSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EnabledStatusReason1Choice#Reason
 * EnabledStatusReason1Choice.Reason}</li>
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
public class EnabledStatusReason1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * There is no reason available or to report for the enabled account status.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.ProformaStatusReason1Choice#NoSpecifiedReason
	 * ProformaStatusReason1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DisabledStatusReason1Choice#NoSpecifiedReason
	 * DisabledStatusReason1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountStatusUpdateInstructionReason1Choice#NoSpecifiedReason
	 * AccountStatusUpdateInstructionReason1Choice.NoSpecifiedReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute NoSpecifiedReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EnabledStatusReason1Choice.mmObject();
			isDerived = false;
			xmlTag = "NoSpcfdRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSpecifiedReason";
			definition = "There is no reason available or to report for the enabled account status.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProformaStatusReason1Choice.NoSpecifiedReason, com.tools20022.repository.choice.DisabledStatusReason1Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AccountStatusUpdateInstructionReason1Choice.NoSpecifiedReason);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};
	/**
	 * Reason for the enabled account status.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.ProformaStatusReason1Choice#Reason
	 * ProformaStatusReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DisabledStatusReason1Choice#Reason
	 * DisabledStatusReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountStatusUpdateInstructionReason1Choice#Reason
	 * AccountStatusUpdateInstructionReason1Choice.Reason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Reason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EnabledStatusReason1Choice.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the enabled account status.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProformaStatusReason1Choice.Reason, com.tools20022.repository.choice.DisabledStatusReason1Choice.Reason,
					com.tools20022.repository.choice.AccountStatusUpdateInstructionReason1Choice.Reason);
			minOccurs = 1;
			type_lazy = () -> EnabledStatusReason1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.EnabledStatusReason1Choice.NoSpecifiedReason, com.tools20022.repository.choice.EnabledStatusReason1Choice.Reason);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EnabledStatusReason1Choice";
				definition = "Choice of formats for an enabled status reason.";
				nextVersions_lazy = () -> Arrays.asList(ProformaStatusReason1Choice.mmObject(), DisabledStatusReason1Choice.mmObject(), AccountStatusUpdateInstructionReason1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}