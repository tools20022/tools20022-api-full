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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsmt.*;
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.entity.FinancialInstitution;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique and unambiguous identifier of a financial institution, as assigned
 * under an internationally recognised or proprietary identification scheme.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BICIdentification1#mmBIC
 * BICIdentification1.mmBIC}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FinancialInstitution
 * FinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportRequestV03#mmEntitiesToBeReported
 * ActivityReportRequestV03.mmEntitiesToBeReported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#mmInitiator
 * AmendmentAcceptanceNotificationV03.mmInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmInitiator
 * AmendmentRejectionNotificationV03.mmInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmBuyerBank
 * BaselineMatchReportV03.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmSellerBank
 * BaselineMatchReportV03.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmBuyerBank
 * BaselineReportV03.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmSellerBank
 * BaselineReportV03.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#mmBuyerBank
 * DataSetMatchReportV03.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#mmSellerBank
 * DataSetMatchReportV03.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmBuyerBank
 * DataSetSubmissionV03.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmSellerBank
 * DataSetSubmissionV03.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmBuyerBank
 * DeltaReportV03.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmSellerBank
 * DeltaReportV03.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmSubmitter
 * ForwardDataSetSubmissionReportV03.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmBuyerBank
 * ForwardDataSetSubmissionReportV03.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmSellerBank
 * ForwardDataSetSubmissionReportV03.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#mmInitiator
 * StatusChangeRequestNotificationV03.mmInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#mmInitiator
 * StatusExtensionRequestNotificationV03.mmInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportRequestV03#mmEntitiesToBeReported
 * StatusReportRequestV03.mmEntitiesToBeReported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#mmBuyerBank
 * IntentToPayNotificationV01.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#mmSellerBank
 * IntentToPayNotificationV01.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#mmBuyerBank
 * ForwardIntentToPayNotificationV01.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#mmSellerBank
 * ForwardIntentToPayNotificationV01.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#mmInitiator
 * SpecialNotificationV01.mmInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#mmInitiator
 * RoleAndBaselineAcceptanceNotificationV01.mmInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#mmInitiator
 * RoleAndBaselineRejectionNotificationV01.mmInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmBuyerBank
 * DataSetSubmissionV04.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmSellerBank
 * DataSetSubmissionV04.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmSubmitter
 * ForwardDataSetSubmissionReportV04.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmBuyerBank
 * ForwardDataSetSubmissionReportV04.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmSellerBank
 * ForwardDataSetSubmissionReportV04.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#mmBuyerBank
 * IntentToPayNotificationV02.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#mmSellerBank
 * IntentToPayNotificationV02.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#mmBuyerBank
 * ForwardIntentToPayNotificationV02.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#mmSellerBank
 * ForwardIntentToPayNotificationV02.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmBuyerBank
 * BaselineReportV04.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmSellerBank
 * BaselineReportV04.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmSubmitter
 * ForwardDataSetSubmissionReportV05.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmBuyerBank
 * ForwardDataSetSubmissionReportV05.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmSellerBank
 * ForwardDataSetSubmissionReportV05.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmBuyerBank
 * DataSetSubmissionV05.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmSellerBank
 * DataSetSubmissionV05.mmSellerBank}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BICIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BICIdentification1", propOrder = "bIC")
public class BICIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BIC", required = true)
	protected BICIdentifier bIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BIC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BICIdentification1, BICIdentifier> mmBIC = new MMMessageAttribute<BICIdentification1, BICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
			isDerived = false;
			xmlTag = "BIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BIC";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}

		@Override
		public BICIdentifier getValue(BICIdentification1 obj) {
			return obj.getBIC();
		}

		@Override
		public void setValue(BICIdentification1 obj, BICIdentifier value) {
			obj.setBIC(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BICIdentification1.mmBIC);
				messageBuildingBlock_lazy = () -> Arrays.asList(ActivityReportRequestV03.mmEntitiesToBeReported, AmendmentAcceptanceNotificationV03.mmInitiator, AmendmentRejectionNotificationV03.mmInitiator,
						BaselineMatchReportV03.mmBuyerBank, BaselineMatchReportV03.mmSellerBank, BaselineReportV03.mmBuyerBank, BaselineReportV03.mmSellerBank, DataSetMatchReportV03.mmBuyerBank, DataSetMatchReportV03.mmSellerBank,
						DataSetSubmissionV03.mmBuyerBank, DataSetSubmissionV03.mmSellerBank, DeltaReportV03.mmBuyerBank, DeltaReportV03.mmSellerBank, ForwardDataSetSubmissionReportV03.mmSubmitter,
						ForwardDataSetSubmissionReportV03.mmBuyerBank, ForwardDataSetSubmissionReportV03.mmSellerBank, StatusChangeRequestNotificationV03.mmInitiator, StatusExtensionRequestNotificationV03.mmInitiator,
						StatusReportRequestV03.mmEntitiesToBeReported, IntentToPayNotificationV01.mmBuyerBank, IntentToPayNotificationV01.mmSellerBank, ForwardIntentToPayNotificationV01.mmBuyerBank,
						ForwardIntentToPayNotificationV01.mmSellerBank, SpecialNotificationV01.mmInitiator, RoleAndBaselineAcceptanceNotificationV01.mmInitiator, RoleAndBaselineRejectionNotificationV01.mmInitiator,
						DataSetSubmissionV04.mmBuyerBank, DataSetSubmissionV04.mmSellerBank, ForwardDataSetSubmissionReportV04.mmSubmitter, ForwardDataSetSubmissionReportV04.mmBuyerBank, ForwardDataSetSubmissionReportV04.mmSellerBank,
						IntentToPayNotificationV02.mmBuyerBank, IntentToPayNotificationV02.mmSellerBank, ForwardIntentToPayNotificationV02.mmBuyerBank, ForwardIntentToPayNotificationV02.mmSellerBank, BaselineReportV04.mmBuyerBank,
						BaselineReportV04.mmSellerBank, ForwardDataSetSubmissionReportV05.mmSubmitter, ForwardDataSetSubmissionReportV05.mmBuyerBank, ForwardDataSetSubmissionReportV05.mmSellerBank, DataSetSubmissionV05.mmBuyerBank,
						DataSetSubmissionV05.mmSellerBank);
				trace_lazy = () -> FinancialInstitution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "BICIdentification1";
				definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.";
			}
		});
		return mmObject_lazy.get();
	}

	public BICIdentifier getBIC() {
		return bIC;
	}

	public BICIdentification1 setBIC(BICIdentifier bIC) {
		this.bIC = Objects.requireNonNull(bIC);
		return this;
	}
}