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

package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.reda.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the communication of reference data related to
 * financial instruments, parties, accounts, prices and other business
 * information required to support financial activities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "reda"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.FundProcessingPassportReportV02
 * FundProcessingPassportReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02
 * InvestmentFundReportRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04
 * PriceReportCancellationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PriceReportV04
 * PriceReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01
 * StandingSettlementInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01
 * StandingSettlementInstructionCancellationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01
 * StandingSettlementInstructionStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01
 * StandingSettlementInstructionDeletionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataUpdateRequestV01
 * NettingCutOffReferenceDataUpdateRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01
 * NettingCutOffReferenceDataReportV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyAuditTrailQueryV01
 * PartyAuditTrailQueryV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyActivityAdviceV01
 * PartyActivityAdviceV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyCreationRequestV01
 * PartyCreationRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyReportV01
 * PartyReportV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyAuditTrailReportV02
 * PartyAuditTrailReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyDeletionRequestV01
 * PartyDeletionRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyQueryV01
 * PartyQueryV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyStatusAdviceV01
 * PartyStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyModificationRequestV01
 * PartyModificationRequestV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reference Data - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the communication of reference data related to financial instruments, parties, accounts, prices and other business information required to support financial activities."
 * </li>
 * </ul>
 */
public class ReferenceDataLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reference Data - Latest version - master";
				definition = "Messages that support the communication of reference data related to financial instruments, parties, accounts, prices and other business information required to support financial activities.";
				messageDefinition_lazy = () -> Arrays.asList(FundProcessingPassportReportV02.mmObject(), InvestmentFundReportRequestV02.mmObject(), PriceReportCancellationV04.mmObject(), PriceReportV04.mmObject(),
						StandingSettlementInstructionV01.mmObject(), StandingSettlementInstructionCancellationV01.mmObject(), StandingSettlementInstructionStatusAdviceV01.mmObject(), StandingSettlementInstructionDeletionV01.mmObject(),
						NettingCutOffReferenceDataUpdateRequestV01.mmObject(), NettingCutOffReferenceDataReportV01.mmObject(), PartyAuditTrailQueryV01.mmObject(), PartyActivityAdviceV01.mmObject(), PartyCreationRequestV01.mmObject(),
						PartyReportV01.mmObject(), PartyAuditTrailReportV02.mmObject(), PartyDeletionRequestV01.mmObject(), PartyQueryV01.mmObject(), PartyStatusAdviceV01.mmObject(), PartyModificationRequestV01.mmObject());
				code = "reda";
			}
		});
		return mmObject_lazy.get();
	}
}