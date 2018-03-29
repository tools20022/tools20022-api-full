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
import com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01;
import com.tools20022.repository.entity.DefaultFundContribution;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection6;
import com.tools20022.repository.msg.GenericIdentification165;
import com.tools20022.repository.msg.InitialMarginRequirement1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Obligations of a clearing member with respect to a central counterparty that
 * are calculated based on end of day positions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement2#mmInitialMarginRequirements
 * EndOfDayRequirement2.mmInitialMarginRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement2#mmVariationMarginRequirements
 * EndOfDayRequirement2.mmVariationMarginRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement2#mmMarginAccountIdentification
 * EndOfDayRequirement2.mmMarginAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01#mmEndOfDayRequirement
 * CCPMemberRequirementsReportV01.mmEndOfDayRequirement}</li>
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
 * "EndOfDayRequirement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligations of a clearing member with respect to a central counterparty that are calculated based on end of day positions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EndOfDayRequirement2", propOrder = {"initialMarginRequirements", "variationMarginRequirements", "marginAccountIdentification"})
public class EndOfDayRequirement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InitlMrgnRqrmnts", required = true)
	protected InitialMarginRequirement1 initialMarginRequirements;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InitialMarginRequirement1
	 * InitialMarginRequirement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmInitialMargin
	 * MarginCall.mmInitialMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement2
	 * EndOfDayRequirement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlMrgnRqrmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMarginRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Liability and assets that arise for a clearing member with respect to a central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EndOfDayRequirement2, InitialMarginRequirement1> mmInitialMarginRequirements = new MMMessageAssociationEnd<EndOfDayRequirement2, InitialMarginRequirement1>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmInitialMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.EndOfDayRequirement2.mmObject();
			isDerived = false;
			xmlTag = "InitlMrgnRqrmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMarginRequirements";
			definition = "Liability and assets that arise for a clearing member with respect to a central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InitialMarginRequirement1.mmObject();
		}

		@Override
		public InitialMarginRequirement1 getValue(EndOfDayRequirement2 obj) {
			return obj.getInitialMarginRequirements();
		}

		@Override
		public void setValue(EndOfDayRequirement2 obj, InitialMarginRequirement1 value) {
			obj.setInitialMarginRequirements(value);
		}
	};
	@XmlElement(name = "VartnMrgnRqrmnts", required = true)
	protected AmountAndDirection6 variationMarginRequirements;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmVariationMargin
	 * MarginCall.mmVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement2
	 * EndOfDayRequirement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnRqrmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total change in the mark-to-market value of the margin account from the previous day, net of changes in mark-to-market relating to the entry or exit of derivative positions not entered into at zero mark-to-market (such as option premiums and upsettled upfront fees). Indicates whether the variation margin is paid to clearing members."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EndOfDayRequirement2, AmountAndDirection6> mmVariationMarginRequirements = new MMMessageAssociationEnd<EndOfDayRequirement2, AmountAndDirection6>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmVariationMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.EndOfDayRequirement2.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnRqrmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRequirements";
			definition = "Total change in the mark-to-market value of the margin account from the previous day, net of changes in mark-to-market relating to the entry or exit of derivative positions not entered into at zero mark-to-market (such as option premiums and upsettled upfront fees). Indicates whether the variation margin is paid to clearing members.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(EndOfDayRequirement2 obj) {
			return obj.getVariationMarginRequirements();
		}

		@Override
		public void setValue(EndOfDayRequirement2 obj, AmountAndDirection6 value) {
			obj.setVariationMarginRequirements(value);
		}
	};
	@XmlElement(name = "MrgnAcctId", required = true)
	protected GenericIdentification165 marginAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification165
	 * GenericIdentification165}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmContributionAccount
	 * DefaultFundContribution.mmContributionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement2
	 * EndOfDayRequirement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of account used to calculate margin requirements. Usage: In the context of a central counterparty, if reported at the client level (expected for gross omnibus and individual segregated accounts), will report the Client ID in the Internal ID field and choose 'ClientID' for the CCP Participant ID Type. If reported at the clearing member account level will report the account ID in the Internal ID field and choose 'AccountID' for the CCP Participant ID Type.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EndOfDayRequirement2, GenericIdentification165> mmMarginAccountIdentification = new MMMessageAssociationEnd<EndOfDayRequirement2, GenericIdentification165>() {
		{
			businessElementTrace_lazy = () -> DefaultFundContribution.mmContributionAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.EndOfDayRequirement2.mmObject();
			isDerived = false;
			xmlTag = "MrgnAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginAccountIdentification";
			definition = "Identification of account used to calculate margin requirements. Usage: In the context of a central counterparty, if reported at the client level (expected for gross omnibus and individual segregated accounts), will report the Client ID in the Internal ID field and choose 'ClientID' for the CCP Participant ID Type. If reported at the clearing member account level will report the account ID in the Internal ID field and choose 'AccountID' for the CCP Participant ID Type.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification165.mmObject();
		}

		@Override
		public GenericIdentification165 getValue(EndOfDayRequirement2 obj) {
			return obj.getMarginAccountIdentification();
		}

		@Override
		public void setValue(EndOfDayRequirement2 obj, GenericIdentification165 value) {
			obj.setMarginAccountIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EndOfDayRequirement2.mmInitialMarginRequirements, com.tools20022.repository.msg.EndOfDayRequirement2.mmVariationMarginRequirements,
						com.tools20022.repository.msg.EndOfDayRequirement2.mmMarginAccountIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPMemberRequirementsReportV01.mmEndOfDayRequirement);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EndOfDayRequirement2";
				definition = "Obligations of a clearing member with respect to a central counterparty that are calculated based on end of day positions.";
			}
		});
		return mmObject_lazy.get();
	}

	public InitialMarginRequirement1 getInitialMarginRequirements() {
		return initialMarginRequirements;
	}

	public EndOfDayRequirement2 setInitialMarginRequirements(InitialMarginRequirement1 initialMarginRequirements) {
		this.initialMarginRequirements = Objects.requireNonNull(initialMarginRequirements);
		return this;
	}

	public AmountAndDirection6 getVariationMarginRequirements() {
		return variationMarginRequirements;
	}

	public EndOfDayRequirement2 setVariationMarginRequirements(AmountAndDirection6 variationMarginRequirements) {
		this.variationMarginRequirements = Objects.requireNonNull(variationMarginRequirements);
		return this;
	}

	public GenericIdentification165 getMarginAccountIdentification() {
		return marginAccountIdentification;
	}

	public EndOfDayRequirement2 setMarginAccountIdentification(GenericIdentification165 marginAccountIdentification) {
		this.marginAccountIdentification = Objects.requireNonNull(marginAccountIdentification);
		return this;
	}
}