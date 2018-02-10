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
import com.tools20022.repository.codeset.ReportingWaiverType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of regulatory reporting pre-trade waiver.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#NegotiatedTransactionInIlliquidFinancialInstrument
 * ReportingWaiverType1Code.NegotiatedTransactionInIlliquidFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#NegotiatedTransactionInLiquidFinancialInstrument
 * ReportingWaiverType1Code.NegotiatedTransactionInLiquidFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#NegotiatedTransactionWithConditions
 * ReportingWaiverType1Code.NegotiatedTransactionWithConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#IlliquidInstrumentTransaction
 * ReportingWaiverType1Code.IlliquidInstrumentTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#ReferencePriceTransaction
 * ReportingWaiverType1Code.ReferencePriceTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType1Code#AboveSpecificSizeTransaction
 * ReportingWaiverType1Code.AboveSpecificSizeTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverTypeCode
 * ReportingWaiverTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReportingWaiverType1Code extends MMCode {

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
	public static final ReportingWaiverType1Code NegotiatedTransactionInIlliquidFinancialInstrument = new ReportingWaiverType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTransactionInIlliquidFinancialInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType1Code.mmObject();
			codeName = ReportingWaiverTypeCode.NegotiatedTransactionInIlliquidFinancialInstrument.getCodeName().orElse(name);
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
	public static final ReportingWaiverType1Code NegotiatedTransactionInLiquidFinancialInstrument = new ReportingWaiverType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTransactionInLiquidFinancialInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType1Code.mmObject();
			codeName = ReportingWaiverTypeCode.NegotiatedTransactionInLiquidFinancialInstrument.getCodeName().orElse(name);
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
	public static final ReportingWaiverType1Code NegotiatedTransactionWithConditions = new ReportingWaiverType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTransactionWithConditions";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType1Code.mmObject();
			codeName = ReportingWaiverTypeCode.NegotiatedTransactionWithConditions.getCodeName().orElse(name);
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
	public static final ReportingWaiverType1Code IlliquidInstrumentTransaction = new ReportingWaiverType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IlliquidInstrumentTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType1Code.mmObject();
			codeName = ReportingWaiverTypeCode.IlliquidInstrumentTransaction.getCodeName().orElse(name);
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
	public static final ReportingWaiverType1Code ReferencePriceTransaction = new ReportingWaiverType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePriceTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType1Code.mmObject();
			codeName = ReportingWaiverTypeCode.ReferencePriceTransaction.getCodeName().orElse(name);
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
	public static final ReportingWaiverType1Code AboveSpecificSizeTransaction = new ReportingWaiverType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AboveSpecificSizeTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType1Code.mmObject();
			codeName = ReportingWaiverTypeCode.AboveSpecificSizeTransaction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReportingWaiverType1Code> codesByName = new LinkedHashMap<>();

	protected ReportingWaiverType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingWaiverType1Code";
				definition = "Specifies the type of regulatory reporting pre-trade waiver.";
				trace_lazy = () -> ReportingWaiverTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportingWaiverType1Code.NegotiatedTransactionInIlliquidFinancialInstrument,
						com.tools20022.repository.codeset.ReportingWaiverType1Code.NegotiatedTransactionInLiquidFinancialInstrument, com.tools20022.repository.codeset.ReportingWaiverType1Code.NegotiatedTransactionWithConditions,
						com.tools20022.repository.codeset.ReportingWaiverType1Code.IlliquidInstrumentTransaction, com.tools20022.repository.codeset.ReportingWaiverType1Code.ReferencePriceTransaction,
						com.tools20022.repository.codeset.ReportingWaiverType1Code.AboveSpecificSizeTransaction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NegotiatedTransactionInIlliquidFinancialInstrument.getCodeName().get(), NegotiatedTransactionInIlliquidFinancialInstrument);
		codesByName.put(NegotiatedTransactionInLiquidFinancialInstrument.getCodeName().get(), NegotiatedTransactionInLiquidFinancialInstrument);
		codesByName.put(NegotiatedTransactionWithConditions.getCodeName().get(), NegotiatedTransactionWithConditions);
		codesByName.put(IlliquidInstrumentTransaction.getCodeName().get(), IlliquidInstrumentTransaction);
		codesByName.put(ReferencePriceTransaction.getCodeName().get(), ReferencePriceTransaction);
		codesByName.put(AboveSpecificSizeTransaction.getCodeName().get(), AboveSpecificSizeTransaction);
	}

	public static ReportingWaiverType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReportingWaiverType1Code[] values() {
		ReportingWaiverType1Code[] values = new ReportingWaiverType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReportingWaiverType1Code> {
		@Override
		public ReportingWaiverType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReportingWaiverType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}