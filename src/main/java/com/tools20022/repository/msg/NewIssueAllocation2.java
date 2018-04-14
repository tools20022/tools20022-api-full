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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.choice.DeMinimus1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Investor;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the investment account ownership with respect to new issue
 * allocation for a hedge fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2#mmRestricted
 * NewIssueAllocation2.mmRestricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2#mmExemptPersonReason
 * NewIssueAllocation2.mmExemptPersonReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2#mmDeMinimus
 * NewIssueAllocation2.mmDeMinimus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Investor Investor}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmNewIssueAllocation
 * AccountOpeningInstructionV05.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmNewIssueAllocation
 * AccountDetailsConfirmationV05.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmNewIssueAllocation
 * AccountOpeningInstructionV06.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmNewIssueAllocation
 * AccountDetailsConfirmationV06.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmNewIssueAllocation
 * AccountDetailsConfirmationV07.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmNewIssueAllocation
 * AccountOpeningInstructionV07.mmNewIssueAllocation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NewIssueAllocation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the investment account ownership with respect to new issue allocation for a hedge fund."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1
 * NewIssueAllocation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NewIssueAllocation2", propOrder = {"restricted", "exemptPersonReason", "deMinimus"})
public class NewIssueAllocation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rstrctd", required = true)
	protected YesNoIndicator restricted;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Investor#mmRestricted
	 * Investor.mmRestricted}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2
	 * NewIssueAllocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor is eligible to participate in the profits and losses from a new issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmRestricted
	 * NewIssueAllocation1.mmRestricted}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NewIssueAllocation2, YesNoIndicator> mmRestricted = new MMMessageAttribute<NewIssueAllocation2, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Investor.mmRestricted;
			componentContext_lazy = () -> com.tools20022.repository.msg.NewIssueAllocation2.mmObject();
			isDerived = false;
			xmlTag = "Rstrctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			definition = "Indicates whether the investor is eligible to participate in the profits and losses from a new issue.";
			previousVersion_lazy = () -> NewIssueAllocation1.mmRestricted;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(NewIssueAllocation2 obj) {
			return obj.getRestricted();
		}

		@Override
		public void setValue(NewIssueAllocation2 obj, YesNoIndicator value) {
			obj.setRestricted(value);
		}
	};
	@XmlElement(name = "XmptPrsnRsn")
	protected Max350Text exemptPersonReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2
	 * NewIssueAllocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptPrsnRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptPersonReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for exemption."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmExemptPersonReason
	 * NewIssueAllocation1.mmExemptPersonReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NewIssueAllocation2, Optional<Max350Text>> mmExemptPersonReason = new MMMessageAttribute<NewIssueAllocation2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NewIssueAllocation2.mmObject();
			isDerived = false;
			xmlTag = "XmptPrsnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptPersonReason";
			definition = "Reason for exemption.";
			previousVersion_lazy = () -> NewIssueAllocation1.mmExemptPersonReason;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(NewIssueAllocation2 obj) {
			return obj.getExemptPersonReason();
		}

		@Override
		public void setValue(NewIssueAllocation2 obj, Optional<Max350Text> value) {
			obj.setExemptPersonReason(value.orElse(null));
		}
	};
	@XmlElement(name = "DeMnms")
	protected DeMinimus1Choice deMinimus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DeMinimus1Choice
	 * DeMinimus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2
	 * NewIssueAllocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeMnms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeMinimus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions applicable when the investor is covered by the \"de minimis\" exemption."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NewIssueAllocation2, Optional<DeMinimus1Choice>> mmDeMinimus = new MMMessageAssociationEnd<NewIssueAllocation2, Optional<DeMinimus1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NewIssueAllocation2.mmObject();
			isDerived = false;
			xmlTag = "DeMnms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeMinimus";
			definition = "Conditions applicable when the investor is covered by the \"de minimis\" exemption.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeMinimus1Choice.mmObject();
		}

		@Override
		public Optional<DeMinimus1Choice> getValue(NewIssueAllocation2 obj) {
			return obj.getDeMinimus();
		}

		@Override
		public void setValue(NewIssueAllocation2 obj, Optional<DeMinimus1Choice> value) {
			obj.setDeMinimus(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NewIssueAllocation2.mmRestricted, com.tools20022.repository.msg.NewIssueAllocation2.mmExemptPersonReason,
						com.tools20022.repository.msg.NewIssueAllocation2.mmDeMinimus);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountOpeningInstructionV05.mmNewIssueAllocation, AccountDetailsConfirmationV05.mmNewIssueAllocation, AccountOpeningInstructionV06.mmNewIssueAllocation,
						AccountDetailsConfirmationV06.mmNewIssueAllocation, AccountDetailsConfirmationV07.mmNewIssueAllocation, AccountOpeningInstructionV07.mmNewIssueAllocation);
				trace_lazy = () -> Investor.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NewIssueAllocation2";
				definition = "Information about the investment account ownership with respect to new issue allocation for a hedge fund.";
				previousVersion_lazy = () -> NewIssueAllocation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getRestricted() {
		return restricted;
	}

	public NewIssueAllocation2 setRestricted(YesNoIndicator restricted) {
		this.restricted = Objects.requireNonNull(restricted);
		return this;
	}

	public Optional<Max350Text> getExemptPersonReason() {
		return exemptPersonReason == null ? Optional.empty() : Optional.of(exemptPersonReason);
	}

	public NewIssueAllocation2 setExemptPersonReason(Max350Text exemptPersonReason) {
		this.exemptPersonReason = exemptPersonReason;
		return this;
	}

	public Optional<DeMinimus1Choice> getDeMinimus() {
		return deMinimus == null ? Optional.empty() : Optional.of(deMinimus);
	}

	public NewIssueAllocation2 setDeMinimus(DeMinimus1Choice deMinimus) {
		this.deMinimus = deMinimus;
		return this;
	}
}