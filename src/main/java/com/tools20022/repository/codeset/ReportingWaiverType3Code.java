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
import com.tools20022.repository.codeset.ReportingWaiverType3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#BenchmarkTransaction
 * ReportingWaiverType3Code.BenchmarkTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#AgencyCrossTransaction
 * ReportingWaiverType3Code.AgencyCrossTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#IlliquidInstrumentTransaction
 * ReportingWaiverType3Code.IlliquidInstrumentTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#AboveSpecificSizeTransaction
 * ReportingWaiverType3Code.AboveSpecificSizeTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#Cancellations
 * ReportingWaiverType3Code.Cancellations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#Amendments
 * ReportingWaiverType3Code.Amendments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#SpecialDividendTransaction
 * ReportingWaiverType3Code.SpecialDividendTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#TransactionWithPriceImprovment
 * ReportingWaiverType3Code.TransactionWithPriceImprovment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#DuplicativeTradeReport
 * ReportingWaiverType3Code.DuplicativeTradeReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#LargeInScale
 * ReportingWaiverType3Code.LargeInScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#TransactionNotContributingToPriceDiscovery
 * ReportingWaiverType3Code.TransactionNotContributingToPriceDiscovery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#PackageTransaction
 * ReportingWaiverType3Code.PackageTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code#ExchangeForPhysical
 * ReportingWaiverType3Code.ExchangeForPhysical}</li>
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
 * "ReportingWaiverType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of regulatory reporting pre-trade waiver."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReportingWaiverType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkTransaction"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code BenchmarkTransaction = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.BenchmarkTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgencyCrossTransaction"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code AgencyCrossTransaction = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgencyCrossTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.AgencyCrossTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IlliquidInstrumentTransaction"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code IlliquidInstrumentTransaction = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IlliquidInstrumentTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.IlliquidInstrumentTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AboveSpecificSizeTransaction"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code AboveSpecificSizeTransaction = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AboveSpecificSizeTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.AboveSpecificSizeTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellations"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code Cancellations = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellations";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.Cancellations.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendments"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code Amendments = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendments";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.Amendments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDividendTransaction"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code SpecialDividendTransaction = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDividendTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.SpecialDividendTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionWithPriceImprovment"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code TransactionWithPriceImprovment = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionWithPriceImprovment";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.TransactionWithPriceImprovment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicativeTradeReport"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code DuplicativeTradeReport = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicativeTradeReport";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.DuplicativeTradeReport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LargeInScale"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code LargeInScale = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LargeInScale";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.LargeInScale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNotContributingToPriceDiscovery"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code TransactionNotContributingToPriceDiscovery = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNotContributingToPriceDiscovery";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.TransactionNotContributingToPriceDiscovery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackageTransaction"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code PackageTransaction = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PackageTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.PackageTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingWaiverType3Code
	 * ReportingWaiverType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForPhysical"</li>
	 * </ul>
	 */
	public static final ReportingWaiverType3Code ExchangeForPhysical = new ReportingWaiverType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForPhysical";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingWaiverType3Code.mmObject();
			codeName = ReportingWaiverTypeCode.ExchangeForPhysical.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReportingWaiverType3Code> codesByName = new LinkedHashMap<>();

	protected ReportingWaiverType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingWaiverType3Code";
				definition = "Specifies the type of regulatory reporting pre-trade waiver.";
				trace_lazy = () -> ReportingWaiverTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportingWaiverType3Code.BenchmarkTransaction, com.tools20022.repository.codeset.ReportingWaiverType3Code.AgencyCrossTransaction,
						com.tools20022.repository.codeset.ReportingWaiverType3Code.IlliquidInstrumentTransaction, com.tools20022.repository.codeset.ReportingWaiverType3Code.AboveSpecificSizeTransaction,
						com.tools20022.repository.codeset.ReportingWaiverType3Code.Cancellations, com.tools20022.repository.codeset.ReportingWaiverType3Code.Amendments,
						com.tools20022.repository.codeset.ReportingWaiverType3Code.SpecialDividendTransaction, com.tools20022.repository.codeset.ReportingWaiverType3Code.TransactionWithPriceImprovment,
						com.tools20022.repository.codeset.ReportingWaiverType3Code.DuplicativeTradeReport, com.tools20022.repository.codeset.ReportingWaiverType3Code.LargeInScale,
						com.tools20022.repository.codeset.ReportingWaiverType3Code.TransactionNotContributingToPriceDiscovery, com.tools20022.repository.codeset.ReportingWaiverType3Code.PackageTransaction,
						com.tools20022.repository.codeset.ReportingWaiverType3Code.ExchangeForPhysical);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BenchmarkTransaction.getCodeName().get(), BenchmarkTransaction);
		codesByName.put(AgencyCrossTransaction.getCodeName().get(), AgencyCrossTransaction);
		codesByName.put(IlliquidInstrumentTransaction.getCodeName().get(), IlliquidInstrumentTransaction);
		codesByName.put(AboveSpecificSizeTransaction.getCodeName().get(), AboveSpecificSizeTransaction);
		codesByName.put(Cancellations.getCodeName().get(), Cancellations);
		codesByName.put(Amendments.getCodeName().get(), Amendments);
		codesByName.put(SpecialDividendTransaction.getCodeName().get(), SpecialDividendTransaction);
		codesByName.put(TransactionWithPriceImprovment.getCodeName().get(), TransactionWithPriceImprovment);
		codesByName.put(DuplicativeTradeReport.getCodeName().get(), DuplicativeTradeReport);
		codesByName.put(LargeInScale.getCodeName().get(), LargeInScale);
		codesByName.put(TransactionNotContributingToPriceDiscovery.getCodeName().get(), TransactionNotContributingToPriceDiscovery);
		codesByName.put(PackageTransaction.getCodeName().get(), PackageTransaction);
		codesByName.put(ExchangeForPhysical.getCodeName().get(), ExchangeForPhysical);
	}

	public static ReportingWaiverType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReportingWaiverType3Code[] values() {
		ReportingWaiverType3Code[] values = new ReportingWaiverType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReportingWaiverType3Code> {
		@Override
		public ReportingWaiverType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReportingWaiverType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}