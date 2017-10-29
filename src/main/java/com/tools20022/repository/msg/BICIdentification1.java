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
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.entity.FinancialInstitution;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * <li>{@linkplain com.tools20022.repository.msg.BICIdentification1#BIC
 * BICIdentification1.BIC}</li>
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
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportRequestV03#EntitiesToBeReported
 * ActivityReportRequestV03.EntitiesToBeReported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#Initiator
 * AmendmentAcceptanceNotificationV03.Initiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#Initiator
 * AmendmentRejectionNotificationV03.Initiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#BuyerBank
 * BaselineMatchReportV03.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#SellerBank
 * BaselineMatchReportV03.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#BuyerBank
 * BaselineReportV03.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#SellerBank
 * BaselineReportV03.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#BuyerBank
 * DataSetMatchReportV03.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#SellerBank
 * DataSetMatchReportV03.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#BuyerBank
 * DataSetSubmissionV03.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#SellerBank
 * DataSetSubmissionV03.SellerBank}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#BuyerBank
 * DeltaReportV03.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#SellerBank
 * DeltaReportV03.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#Submitter
 * ForwardDataSetSubmissionReportV03.Submitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#BuyerBank
 * ForwardDataSetSubmissionReportV03.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#SellerBank
 * ForwardDataSetSubmissionReportV03.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#Initiator
 * StatusChangeRequestNotificationV03.Initiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#Initiator
 * StatusExtensionRequestNotificationV03.Initiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportRequestV03#EntitiesToBeReported
 * StatusReportRequestV03.EntitiesToBeReported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#BuyerBank
 * IntentToPayNotificationV01.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#SellerBank
 * IntentToPayNotificationV01.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#BuyerBank
 * ForwardIntentToPayNotificationV01.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#SellerBank
 * ForwardIntentToPayNotificationV01.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#Initiator
 * SpecialNotificationV01.Initiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#Initiator
 * RoleAndBaselineAcceptanceNotificationV01.Initiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#Initiator
 * RoleAndBaselineRejectionNotificationV01.Initiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#BuyerBank
 * DataSetSubmissionV04.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#SellerBank
 * DataSetSubmissionV04.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#Submitter
 * ForwardDataSetSubmissionReportV04.Submitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#BuyerBank
 * ForwardDataSetSubmissionReportV04.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#SellerBank
 * ForwardDataSetSubmissionReportV04.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#BuyerBank
 * IntentToPayNotificationV02.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#SellerBank
 * IntentToPayNotificationV02.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#BuyerBank
 * ForwardIntentToPayNotificationV02.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#SellerBank
 * ForwardIntentToPayNotificationV02.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#BuyerBank
 * BaselineReportV04.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#SellerBank
 * BaselineReportV04.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#Submitter
 * ForwardDataSetSubmissionReportV05.Submitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#BuyerBank
 * ForwardDataSetSubmissionReportV05.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#SellerBank
 * ForwardDataSetSubmissionReportV05.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#BuyerBank
 * DataSetSubmissionV05.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#SellerBank
 * DataSetSubmissionV05.SellerBank}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BICIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme."
 * </li>
 * </ul>
 */
public class BICIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code allocated to a financial institution by the ISO 9362 Registration
	 * Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#BICFI
	 * OrganisationIdentification.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute BIC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BICIdentification1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.BICFI;
			isDerived = false;
			xmlTag = "BIC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BIC";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BICIdentification1.BIC);
				trace_lazy = () -> FinancialInstitution.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.ActivityReportRequestV03.EntitiesToBeReported, com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03.Initiator,
						com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.Initiator, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.BuyerBank,
						com.tools20022.repository.area.tsmt.BaselineMatchReportV03.SellerBank, com.tools20022.repository.area.tsmt.BaselineReportV03.BuyerBank, com.tools20022.repository.area.tsmt.BaselineReportV03.SellerBank,
						com.tools20022.repository.area.tsmt.DataSetMatchReportV03.BuyerBank, com.tools20022.repository.area.tsmt.DataSetMatchReportV03.SellerBank, com.tools20022.repository.area.tsmt.DataSetSubmissionV03.BuyerBank,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV03.SellerBank, com.tools20022.repository.area.tsmt.DeltaReportV03.BuyerBank, com.tools20022.repository.area.tsmt.DeltaReportV03.SellerBank,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.Submitter, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.BuyerBank,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.SellerBank, com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03.Initiator,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03.Initiator, com.tools20022.repository.area.tsmt.StatusReportRequestV03.EntitiesToBeReported,
						com.tools20022.repository.area.tsmt.IntentToPayNotificationV01.BuyerBank, com.tools20022.repository.area.tsmt.IntentToPayNotificationV01.SellerBank,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01.BuyerBank, com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01.SellerBank,
						com.tools20022.repository.area.tsmt.SpecialNotificationV01.Initiator, com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01.Initiator,
						com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01.Initiator, com.tools20022.repository.area.tsmt.DataSetSubmissionV04.BuyerBank,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV04.SellerBank, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.Submitter,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.BuyerBank, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.SellerBank,
						com.tools20022.repository.area.tsmt.IntentToPayNotificationV02.BuyerBank, com.tools20022.repository.area.tsmt.IntentToPayNotificationV02.SellerBank,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02.BuyerBank, com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02.SellerBank,
						com.tools20022.repository.area.tsmt.BaselineReportV04.BuyerBank, com.tools20022.repository.area.tsmt.BaselineReportV04.SellerBank, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.Submitter,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.BuyerBank, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.SellerBank,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV05.BuyerBank, com.tools20022.repository.area.tsmt.DataSetSubmissionV05.SellerBank);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
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
}