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
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the clearing and settlement processes for payment
 * transactions between financial institutions
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "pacs"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV01
 * FIToFICustomerCreditTransferV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02
 * FIToFICustomerCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV03
 * FIToFICustomerCreditTransferV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV04
 * FIToFICustomerCreditTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV01
 * FIToFICustomerDirectDebitV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV02
 * FIToFICustomerDirectDebitV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV03
 * FIToFICustomerDirectDebitV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV04
 * FIToFICustomerDirectDebitV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentCancellationRequestV01
 * PaymentCancellationRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV01
 * FIToFIPaymentReversalV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV02
 * FIToFIPaymentReversalV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03
 * FIToFIPaymentReversalV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV04
 * FIToFIPaymentReversalV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentStatusReportV02
 * PaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV03
 * FIToFIPaymentStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV04
 * FIToFIPaymentStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05
 * FIToFIPaymentStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV01
 * FinancialInstitutionCreditTransferV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV02
 * FinancialInstitutionCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV03
 * FinancialInstitutionCreditTransferV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV04
 * FinancialInstitutionCreditTransferV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentReturnV01
 * PaymentReturnV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentReturnV02
 * PaymentReturnV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentReturnV03
 * PaymentReturnV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentReturnV04
 * PaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06
 * FIToFIPaymentStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV05
 * FIToFICustomerDirectDebitV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV05
 * FIToFIPaymentReversalV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentReturnV05
 * PaymentReturnV05}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Payments Clearing and Settlement - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the clearing and settlement processes for payment transactions between financial institutions"
 * </li>
 * </ul>
 */
public class PaymentsClearingandSettlementArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Payments Clearing and Settlement - Archive - master";
				definition = "Messages that support the clearing and settlement processes for payment transactions between financial institutions";
				messageDefinition_lazy = () -> Arrays.asList(FIToFICustomerCreditTransferV01.mmObject(), FIToFICustomerCreditTransferV02.mmObject(), FIToFICustomerCreditTransferV03.mmObject(), FIToFICustomerCreditTransferV04.mmObject(),
						FIToFICustomerDirectDebitV01.mmObject(), FIToFICustomerDirectDebitV02.mmObject(), FIToFICustomerDirectDebitV03.mmObject(), FIToFICustomerDirectDebitV04.mmObject(), PaymentCancellationRequestV01.mmObject(),
						FIToFIPaymentReversalV01.mmObject(), FIToFIPaymentReversalV02.mmObject(), FIToFIPaymentReversalV03.mmObject(), FIToFIPaymentReversalV04.mmObject(), PaymentStatusReportV02.mmObject(),
						FIToFIPaymentStatusReportV03.mmObject(), FIToFIPaymentStatusReportV04.mmObject(), FIToFIPaymentStatusReportV05.mmObject(), FinancialInstitutionCreditTransferV01.mmObject(),
						FinancialInstitutionCreditTransferV02.mmObject(), FinancialInstitutionCreditTransferV03.mmObject(), FinancialInstitutionCreditTransferV04.mmObject(), PaymentReturnV01.mmObject(), PaymentReturnV02.mmObject(),
						PaymentReturnV03.mmObject(), PaymentReturnV04.mmObject(), FIToFIPaymentStatusReportV06.mmObject(), FIToFICustomerDirectDebitV05.mmObject(), FIToFIPaymentReversalV05.mmObject(), PaymentReturnV05.mmObject());
				code = "pacs";
			}
		});
		return mmObject_lazy.get();
	}
}