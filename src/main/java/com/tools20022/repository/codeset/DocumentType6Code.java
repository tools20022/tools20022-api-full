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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DocumentTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of financial or commercial document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
 * DocumentTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmMeteredServiceInvoice
 * DocumentType6Code.mmMeteredServiceInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmCreditNoteRelatedToFinancialAdjustment
 * DocumentType6Code.mmCreditNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmDebitNoteRelatedToFinancialAdjustment
 * DocumentType6Code.mmDebitNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmCommercialInvoice
 * DocumentType6Code.mmCommercialInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmCreditNote
 * DocumentType6Code.mmCreditNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmDebitNote
 * DocumentType6Code.mmDebitNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmHireInvoice
 * DocumentType6Code.mmHireInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmSelfBilledInvoice
 * DocumentType6Code.mmSelfBilledInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmCommercialContract
 * DocumentType6Code.mmCommercialContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmStatementOfAccount
 * DocumentType6Code.mmStatementOfAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmDispatchAdvice
 * DocumentType6Code.mmDispatchAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmBillOfLading
 * DocumentType6Code.mmBillOfLading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmVoucher
 * DocumentType6Code.mmVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmAccountReceivableOpenItem
 * DocumentType6Code.mmAccountReceivableOpenItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmTradeServicesUtilityTransaction
 * DocumentType6Code.mmTradeServicesUtilityTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#mmPurchaseOrder
 * DocumentType6Code.mmPurchaseOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MSIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of financial or commercial document."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code
 * DocumentType5Code}</li>
 * </ul>
 */
public class DocumentType6Code extends DocumentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeteredServiceInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmMeteredServiceInvoice
	 * DocumentType5Code.mmMeteredServiceInvoice}</li>
	 * </ul>
	 */
	public static final MMCode mmMeteredServiceInvoice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeteredServiceInvoice";
			previousVersion_lazy = () -> DocumentType5Code.mmMeteredServiceInvoice;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNoteRelatedToFinancialAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmCreditNoteRelatedToFinancialAdjustment
	 * DocumentType5Code.mmCreditNoteRelatedToFinancialAdjustment}</li>
	 * </ul>
	 */
	public static final MMCode mmCreditNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteRelatedToFinancialAdjustment";
			previousVersion_lazy = () -> DocumentType5Code.mmCreditNoteRelatedToFinancialAdjustment;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNoteRelatedToFinancialAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmDebitNoteRelatedToFinancialAdjustment
	 * DocumentType5Code.mmDebitNoteRelatedToFinancialAdjustment}</li>
	 * </ul>
	 */
	public static final MMCode mmDebitNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNoteRelatedToFinancialAdjustment";
			previousVersion_lazy = () -> DocumentType5Code.mmDebitNoteRelatedToFinancialAdjustment;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmCommercialInvoice
	 * DocumentType5Code.mmCommercialInvoice}</li>
	 * </ul>
	 */
	public static final MMCode mmCommercialInvoice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialInvoice";
			previousVersion_lazy = () -> DocumentType5Code.mmCommercialInvoice;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmCreditNote
	 * DocumentType5Code.mmCreditNote}</li>
	 * </ul>
	 */
	public static final MMCode mmCreditNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNote";
			previousVersion_lazy = () -> DocumentType5Code.mmCreditNote;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmDebitNote
	 * DocumentType5Code.mmDebitNote}</li>
	 * </ul>
	 */
	public static final MMCode mmDebitNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNote";
			previousVersion_lazy = () -> DocumentType5Code.mmDebitNote;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HireInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmHireInvoice
	 * DocumentType5Code.mmHireInvoice}</li>
	 * </ul>
	 */
	public static final MMCode mmHireInvoice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HireInvoice";
			previousVersion_lazy = () -> DocumentType5Code.mmHireInvoice;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfBilledInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmSelfBilledInvoice
	 * DocumentType5Code.mmSelfBilledInvoice}</li>
	 * </ul>
	 */
	public static final MMCode mmSelfBilledInvoice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfBilledInvoice";
			previousVersion_lazy = () -> DocumentType5Code.mmSelfBilledInvoice;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmCommercialContract
	 * DocumentType5Code.mmCommercialContract}</li>
	 * </ul>
	 */
	public static final MMCode mmCommercialContract = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialContract";
			previousVersion_lazy = () -> DocumentType5Code.mmCommercialContract;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementOfAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmStatementOfAccount
	 * DocumentType5Code.mmStatementOfAccount}</li>
	 * </ul>
	 */
	public static final MMCode mmStatementOfAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementOfAccount";
			previousVersion_lazy = () -> DocumentType5Code.mmStatementOfAccount;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispatchAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmDispatchAdvice
	 * DocumentType5Code.mmDispatchAdvice}</li>
	 * </ul>
	 */
	public static final MMCode mmDispatchAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispatchAdvice";
			previousVersion_lazy = () -> DocumentType5Code.mmDispatchAdvice;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillOfLading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmBillOfLading
	 * DocumentType5Code.mmBillOfLading}</li>
	 * </ul>
	 */
	public static final MMCode mmBillOfLading = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillOfLading";
			previousVersion_lazy = () -> DocumentType5Code.mmBillOfLading;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Voucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmVoucher
	 * DocumentType5Code.mmVoucher}</li>
	 * </ul>
	 */
	public static final MMCode mmVoucher = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Voucher";
			previousVersion_lazy = () -> DocumentType5Code.mmVoucher;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountReceivableOpenItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmAccountReceivableOpenItem
	 * DocumentType5Code.mmAccountReceivableOpenItem}</li>
	 * </ul>
	 */
	public static final MMCode mmAccountReceivableOpenItem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountReceivableOpenItem";
			previousVersion_lazy = () -> DocumentType5Code.mmAccountReceivableOpenItem;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeServicesUtilityTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType5Code#mmTradeServicesUtilityTransaction
	 * DocumentType5Code.mmTradeServicesUtilityTransaction}</li>
	 * </ul>
	 */
	public static final MMCode mmTradeServicesUtilityTransaction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeServicesUtilityTransaction";
			previousVersion_lazy = () -> DocumentType5Code.mmTradeServicesUtilityTransaction;
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * </ul>
	 */
	public static final MMCode mmPurchaseOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrder";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MSIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentType6Code";
				definition = "Specifies a type of financial or commercial document.";
				previousVersion_lazy = () -> DocumentType5Code.mmObject();
				code_lazy = () -> Arrays.asList(DocumentType6Code.mmMeteredServiceInvoice, DocumentType6Code.mmCreditNoteRelatedToFinancialAdjustment, DocumentType6Code.mmDebitNoteRelatedToFinancialAdjustment,
						DocumentType6Code.mmCommercialInvoice, DocumentType6Code.mmCreditNote, DocumentType6Code.mmDebitNote, DocumentType6Code.mmHireInvoice, DocumentType6Code.mmSelfBilledInvoice, DocumentType6Code.mmCommercialContract,
						DocumentType6Code.mmStatementOfAccount, DocumentType6Code.mmDispatchAdvice, DocumentType6Code.mmBillOfLading, DocumentType6Code.mmVoucher, DocumentType6Code.mmAccountReceivableOpenItem,
						DocumentType6Code.mmTradeServicesUtilityTransaction, DocumentType6Code.mmPurchaseOrder);
				trace_lazy = () -> DocumentTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}