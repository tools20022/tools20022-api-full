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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.AccountStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status of an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmEnabled
 * AccountStatus2.mmEnabled}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmDisabled
 * AccountStatus2.mmDisabled}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmPending
 * AccountStatus2.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatus2#mmPendingOpening
 * AccountStatus2.mmPendingOpening}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmProforma
 * AccountStatus2.mmProforma}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmClosed
 * AccountStatus2.mmClosed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatus2#mmClosurePending
 * AccountStatus2.mmClosurePending}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmOther
 * AccountStatus2.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountStatus
 * AccountStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintClosedStatus1Rule#forAccountStatus2
 * ConstraintClosedStatus1Rule.forAccountStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEnabledDisabledStatus1Rule#forAccountStatus2
 * ConstraintEnabledDisabledStatus1Rule.forAccountStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEnabledDisabledStatus2Rule#forAccountStatus2
 * ConstraintEnabledDisabledStatus2Rule.forAccountStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintClosedStatus3Rule#forAccountStatus2
 * ConstraintClosedStatus3Rule.forAccountStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintClosedStatus2Rule#forAccountStatus2
 * ConstraintClosedStatus2Rule.forAccountStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintClosedStatus4Rule#forAccountStatus2
 * ConstraintClosedStatus4Rule.forAccountStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintClosedStatus5Rule#forAccountStatus2
 * ConstraintClosedStatus5Rule.forAccountStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintClosedStatus6Rule#forAccountStatus2
 * ConstraintClosedStatus6Rule.forAccountStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusElementRule#forAccountStatus2
 * ConstraintStatusElementRule.forAccountStatus2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountStatus2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of an account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountStatus1Choice
 * AccountStatus1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountStatus2", propOrder = {"enabled", "disabled", "pending", "pendingOpening", "proforma", "closed", "closurePending", "other"})
public class AccountStatus2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nbld")
	protected EnabledStatusReason1Choice enabled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.EnabledStatusReason1Choice
	 * EnabledStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2 AccountStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nbld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account can be used for its intended purpose."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnabled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatus2.mmObject();
			isDerived = false;
			xmlTag = "Nbld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enabled";
			definition = "Account can be used for its intended purpose.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EnabledStatusReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "Dsbld")
	protected DisabledStatusReason1Choice disabled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DisabledStatusReason1Choice
	 * DisabledStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2 AccountStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsbld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account cannot temporarily be used for its intended purpose."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDisabled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatus2.mmObject();
			isDerived = false;
			xmlTag = "Dsbld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disabled";
			definition = "Account cannot temporarily be used for its intended purpose.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DisabledStatusReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "Pdg")
	protected PendingStatusReason1Choice pending;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatusReason1Choice
	 * PendingStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2 AccountStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account change is pending approval."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPending = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatus2.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Account change is pending approval.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingStatusReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "PdgOpng")
	protected PendingOpeningStatusReason1Choice pendingOpening;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingOpeningStatusReason1Choice
	 * PendingOpeningStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2 AccountStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgOpng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingOpening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account opening is pending."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingOpening = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatus2.mmObject();
			isDerived = false;
			xmlTag = "PdgOpng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOpening";
			definition = "Account opening is pending.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingOpeningStatusReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "Profrm")
	protected ProformaStatusReason1Choice proforma;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProformaStatusReason1Choice
	 * ProformaStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2 AccountStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Profrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proforma"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is temporary and can be partially used for its intended purpose. The account will be fully available for use when the account servicer has received all relevant documents."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProforma = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatus2.mmObject();
			isDerived = false;
			xmlTag = "Profrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proforma";
			definition = "Account is temporary and can be partially used for its intended purpose. The account will be fully available for use when the account servicer has received all relevant documents.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProformaStatusReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "Clsd")
	protected ClosedStatusReason1Choice closed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClosedStatusReason1Choice
	 * ClosedStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2 AccountStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Clsd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is closed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClosed = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatus2.mmObject();
			isDerived = false;
			xmlTag = "Clsd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closed";
			definition = "Account is closed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClosedStatusReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "ClsrPdg")
	protected ClosurePendingStatusReason1Choice closurePending;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClosurePendingStatusReason1Choice
	 * ClosurePendingStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2 AccountStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsrPdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosurePending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account closure is pending."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClosurePending = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatus2.mmObject();
			isDerived = false;
			xmlTag = "ClsrPdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosurePending";
			definition = "Account closure is pending.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClosurePendingStatusReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "Othr")
	protected List<com.tools20022.repository.msg.OtherAccountStatus1> other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherAccountStatus1
	 * OtherAccountStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2 AccountStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status is a bilaterally agreed status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOther = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatus2.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Status is a bilaterally agreed status.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherAccountStatus1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountStatus2.mmEnabled, com.tools20022.repository.msg.AccountStatus2.mmDisabled, com.tools20022.repository.msg.AccountStatus2.mmPending,
						com.tools20022.repository.msg.AccountStatus2.mmPendingOpening, com.tools20022.repository.msg.AccountStatus2.mmProforma, com.tools20022.repository.msg.AccountStatus2.mmClosed,
						com.tools20022.repository.msg.AccountStatus2.mmClosurePending, com.tools20022.repository.msg.AccountStatus2.mmOther);
				trace_lazy = () -> AccountStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintClosedStatus1Rule.forAccountStatus2, com.tools20022.repository.constraints.ConstraintEnabledDisabledStatus1Rule.forAccountStatus2,
						com.tools20022.repository.constraints.ConstraintEnabledDisabledStatus2Rule.forAccountStatus2, com.tools20022.repository.constraints.ConstraintClosedStatus3Rule.forAccountStatus2,
						com.tools20022.repository.constraints.ConstraintClosedStatus2Rule.forAccountStatus2, com.tools20022.repository.constraints.ConstraintClosedStatus4Rule.forAccountStatus2,
						com.tools20022.repository.constraints.ConstraintClosedStatus5Rule.forAccountStatus2, com.tools20022.repository.constraints.ConstraintClosedStatus6Rule.forAccountStatus2,
						com.tools20022.repository.constraints.ConstraintStatusElementRule.forAccountStatus2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountStatus2";
				definition = "Status of an account.";
				previousVersion_lazy = () -> AccountStatus1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<EnabledStatusReason1Choice> getEnabled() {
		return enabled == null ? Optional.empty() : Optional.of(enabled);
	}

	public AccountStatus2 setEnabled(EnabledStatusReason1Choice enabled) {
		this.enabled = enabled;
		return this;
	}

	public Optional<DisabledStatusReason1Choice> getDisabled() {
		return disabled == null ? Optional.empty() : Optional.of(disabled);
	}

	public AccountStatus2 setDisabled(DisabledStatusReason1Choice disabled) {
		this.disabled = disabled;
		return this;
	}

	public Optional<PendingStatusReason1Choice> getPending() {
		return pending == null ? Optional.empty() : Optional.of(pending);
	}

	public AccountStatus2 setPending(PendingStatusReason1Choice pending) {
		this.pending = pending;
		return this;
	}

	public Optional<PendingOpeningStatusReason1Choice> getPendingOpening() {
		return pendingOpening == null ? Optional.empty() : Optional.of(pendingOpening);
	}

	public AccountStatus2 setPendingOpening(PendingOpeningStatusReason1Choice pendingOpening) {
		this.pendingOpening = pendingOpening;
		return this;
	}

	public Optional<ProformaStatusReason1Choice> getProforma() {
		return proforma == null ? Optional.empty() : Optional.of(proforma);
	}

	public AccountStatus2 setProforma(ProformaStatusReason1Choice proforma) {
		this.proforma = proforma;
		return this;
	}

	public Optional<ClosedStatusReason1Choice> getClosed() {
		return closed == null ? Optional.empty() : Optional.of(closed);
	}

	public AccountStatus2 setClosed(ClosedStatusReason1Choice closed) {
		this.closed = closed;
		return this;
	}

	public Optional<ClosurePendingStatusReason1Choice> getClosurePending() {
		return closurePending == null ? Optional.empty() : Optional.of(closurePending);
	}

	public AccountStatus2 setClosurePending(ClosurePendingStatusReason1Choice closurePending) {
		this.closurePending = closurePending;
		return this;
	}

	public List<OtherAccountStatus1> getOther() {
		return other == null ? other = new ArrayList<>() : other;
	}

	public AccountStatus2 setOther(List<com.tools20022.repository.msg.OtherAccountStatus1> other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}