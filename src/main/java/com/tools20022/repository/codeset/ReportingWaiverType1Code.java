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
import com.tools20022.repository.codeset.ReportingWaiverTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of regulatory reporting pre-trade waiver.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
 * ReportingWaiverTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#mmNegotiatedTransactionInIlliquidFinancialInstrument
 * ReportingWaiverType1Code.mmNegotiatedTransactionInIlliquidFinancialInstrument
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#mmNegotiatedTransactionInLiquidFinancialInstrument
 * ReportingWaiverType1Code.mmNegotiatedTransactionInLiquidFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#mmNegotiatedTransactionWithConditions
 * ReportingWaiverType1Code.mmNegotiatedTransactionWithConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#mmIlliquidInstrumentTransaction
 * ReportingWaiverType1Code.mmIlliquidInstrumentTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#mmReferencePriceTransaction
 * ReportingWaiverType1Code.mmReferencePriceTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#mmAboveSpecificSizeTransaction
 * ReportingWaiverType1Code.mmAboveSpecificSizeTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportingWaiverType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of regulatory reporting pre-trade waiver."</li>
 * </ul>
 */
public class ReportingWaiverType1Code extends ReportingWaiverTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code
	 * ReportingWaiverType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTransactionInIlliquidFinancialInstrument"</li>
	 * </ul>
	 */
	public static final MMCode mmNegotiatedTransactionInIlliquidFinancialInstrument = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTransactionInIlliquidFinancialInstrument";
			owner_lazy = () -> ReportingWaiverType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code
	 * ReportingWaiverType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTransactionInLiquidFinancialInstrument"</li>
	 * </ul>
	 */
	public static final MMCode mmNegotiatedTransactionInLiquidFinancialInstrument = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTransactionInLiquidFinancialInstrument";
			owner_lazy = () -> ReportingWaiverType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code
	 * ReportingWaiverType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTransactionWithConditions"</li>
	 * </ul>
	 */
	public static final MMCode mmNegotiatedTransactionWithConditions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTransactionWithConditions";
			owner_lazy = () -> ReportingWaiverType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code
	 * ReportingWaiverType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IlliquidInstrumentTransaction"</li>
	 * </ul>
	 */
	public static final MMCode mmIlliquidInstrumentTransaction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IlliquidInstrumentTransaction";
			owner_lazy = () -> ReportingWaiverType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code
	 * ReportingWaiverType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferencePriceTransaction"</li>
	 * </ul>
	 */
	public static final MMCode mmReferencePriceTransaction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePriceTransaction";
			owner_lazy = () -> ReportingWaiverType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code
	 * ReportingWaiverType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AboveSpecificSizeTransaction"</li>
	 * </ul>
	 */
	public static final MMCode mmAboveSpecificSizeTransaction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AboveSpecificSizeTransaction";
			owner_lazy = () -> ReportingWaiverType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingWaiverType1Code";
				definition = "Specifies the type of regulatory reporting pre-trade waiver.";
				code_lazy = () -> Arrays.asList(ReportingWaiverType1Code.mmNegotiatedTransactionInIlliquidFinancialInstrument, ReportingWaiverType1Code.mmNegotiatedTransactionInLiquidFinancialInstrument,
						ReportingWaiverType1Code.mmNegotiatedTransactionWithConditions, ReportingWaiverType1Code.mmIlliquidInstrumentTransaction, ReportingWaiverType1Code.mmReferencePriceTransaction,
						ReportingWaiverType1Code.mmAboveSpecificSizeTransaction);
				trace_lazy = () -> ReportingWaiverTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}