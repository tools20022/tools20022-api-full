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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of tax details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#mmWithholdingTax
 * TaxRecordCode.mmWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#mmValueAddedTax
 * TaxRecordCode.mmValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#mmIncomePaymentDetails
 * TaxRecordCode.mmIncomePaymentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#mmTotalAmountForIncomePayments
 * TaxRecordCode.mmTotalAmountForIncomePayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#mmMoneyPaymentDetails
 * TaxRecordCode.mmMoneyPaymentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#mmTotalAmountForMoneyPayments
 * TaxRecordCode.mmTotalAmountForMoneyPayments}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxRecordCode#mmOther
 * TaxRecordCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxRecord1Code
 * TaxRecord1Code}</li>
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
 * <li>"WHTX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxRecordCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of tax details."</li>
 * </ul>
 */
public class TaxRecordCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax record is related to the withholding tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHTX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax record is related to the withholding tax."</li>
	 * </ul>
	 */
	public static final MMCode mmWithholdingTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Tax record is related to the withholding tax.";
			owner_lazy = () -> TaxRecordCode.mmObject();
			codeName = "WHTX";
		}
	};
	/**
	 * Tax record is related to the value added tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VATX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax record is related to the value added tax."</li>
	 * </ul>
	 */
	public static final MMCode mmValueAddedTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Tax record is related to the value added tax.";
			owner_lazy = () -> TaxRecordCode.mmObject();
			codeName = "VATX";
		}
	};
	/**
	 * Tax record is related to the income payment details
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePaymentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax record is related to the income payment details"</li>
	 * </ul>
	 */
	public static final MMCode mmIncomePaymentDetails = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePaymentDetails";
			definition = "Tax record is related to the income payment details";
			owner_lazy = () -> TaxRecordCode.mmObject();
			codeName = "INCP";
		}
	};
	/**
	 * Tax record is related to the total amount for income payments
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TLAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountForIncomePayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax record is related to the total amount for income payments"</li>
	 * </ul>
	 */
	public static final MMCode mmTotalAmountForIncomePayments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountForIncomePayments";
			definition = "Tax record is related to the total amount for income payments";
			owner_lazy = () -> TaxRecordCode.mmObject();
			codeName = "TLAI";
		}
	};
	/**
	 * Tax record is related to the money payments details
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MONP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyPaymentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax record is related to the  money payments details"</li>
	 * </ul>
	 */
	public static final MMCode mmMoneyPaymentDetails = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyPaymentDetails";
			definition = "Tax record is related to the  money payments details";
			owner_lazy = () -> TaxRecordCode.mmObject();
			codeName = "MONP";
		}
	};
	/**
	 * Tax record is related to the total amount for money payments
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TLAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountForMoneyPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax record is related to the total amount for money payments"</li>
	 * </ul>
	 */
	public static final MMCode mmTotalAmountForMoneyPayments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountForMoneyPayments";
			definition = "Tax record is related to the total amount for money payments";
			owner_lazy = () -> TaxRecordCode.mmObject();
			codeName = "TLAM";
		}
	};
	/**
	 * Other tax record type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other tax record type."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other tax record type.";
			owner_lazy = () -> TaxRecordCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("WHTX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecordCode";
				definition = "Specifies the type of tax details.";
				code_lazy = () -> Arrays.asList(TaxRecordCode.mmWithholdingTax, TaxRecordCode.mmValueAddedTax, TaxRecordCode.mmIncomePaymentDetails, TaxRecordCode.mmTotalAmountForIncomePayments, TaxRecordCode.mmMoneyPaymentDetails,
						TaxRecordCode.mmTotalAmountForMoneyPayments, TaxRecordCode.mmOther);
				derivation_lazy = () -> Arrays.asList(TaxRecord1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}