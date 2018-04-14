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
import com.tools20022.repository.codeset.ExtendedOptionFeature1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) specific
 * options.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#ForeignTaxUnfavorable
 * ExtendedOptionFeature1Code.ForeignTaxUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#ForeignTaxFavorable
 * ExtendedOptionFeature1Code.ForeignTaxFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#ForeignTaxExempt
 * ExtendedOptionFeature1Code.ForeignTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#DRIPUnfavorable
 * ExtendedOptionFeature1Code.DRIPUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#DRIPFavorable
 * ExtendedOptionFeature1Code.DRIPFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#DRIPExempt
 * ExtendedOptionFeature1Code.DRIPExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#ForeignCurrencyPayment
 * ExtendedOptionFeature1Code.ForeignCurrencyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#ForeignCurrencyPaymentUnfavorable
 * ExtendedOptionFeature1Code.ForeignCurrencyPaymentUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#ForeignCurrencyPaymentFavorable
 * ExtendedOptionFeature1Code.ForeignCurrencyPaymentFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#ForeignCurrencyPaymentExempt
 * ExtendedOptionFeature1Code.ForeignCurrencyPaymentExempt}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
 * ExtendedOptionFeatureCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtendedOptionFeature1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) specific options."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FORU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExtendedOptionFeature1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxUnfavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeature1Code ForeignTaxUnfavorable = new ExtendedOptionFeature1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxUnfavorable";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeature1Code.mmObject();
			codeName = ExtendedOptionFeatureCode.ForeignTaxUnfavorable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxFavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeature1Code ForeignTaxFavorable = new ExtendedOptionFeature1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxFavorable";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeature1Code.mmObject();
			codeName = ExtendedOptionFeatureCode.ForeignTaxFavorable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeature1Code ForeignTaxExempt = new ExtendedOptionFeature1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeature1Code.mmObject();
			codeName = ExtendedOptionFeatureCode.ForeignTaxExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPUnfavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeature1Code DRIPUnfavorable = new ExtendedOptionFeature1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPUnfavorable";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeature1Code.mmObject();
			codeName = ExtendedOptionFeatureCode.DRIPUnfavorable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPFavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeature1Code DRIPFavorable = new ExtendedOptionFeature1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPFavorable";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeature1Code.mmObject();
			codeName = ExtendedOptionFeatureCode.DRIPFavorable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeature1Code DRIPExempt = new ExtendedOptionFeature1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeature1Code.mmObject();
			codeName = ExtendedOptionFeatureCode.DRIPExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeature1Code ForeignCurrencyPayment = new ExtendedOptionFeature1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeature1Code.mmObject();
			codeName = ExtendedOptionFeatureCode.ForeignCurrencyPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentUnfavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeature1Code ForeignCurrencyPaymentUnfavorable = new ExtendedOptionFeature1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentUnfavorable";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeature1Code.mmObject();
			codeName = ExtendedOptionFeatureCode.ForeignCurrencyPaymentUnfavorable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentFavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeature1Code ForeignCurrencyPaymentFavorable = new ExtendedOptionFeature1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentFavorable";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeature1Code.mmObject();
			codeName = ExtendedOptionFeatureCode.ForeignCurrencyPaymentFavorable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeature1Code ForeignCurrencyPaymentExempt = new ExtendedOptionFeature1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeature1Code.mmObject();
			codeName = ExtendedOptionFeatureCode.ForeignCurrencyPaymentExempt.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ExtendedOptionFeature1Code> codesByName = new LinkedHashMap<>();

	protected ExtendedOptionFeature1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FORU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendedOptionFeature1Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) specific options.";
				trace_lazy = () -> ExtendedOptionFeatureCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExtendedOptionFeature1Code.ForeignTaxUnfavorable, com.tools20022.repository.codeset.ExtendedOptionFeature1Code.ForeignTaxFavorable,
						com.tools20022.repository.codeset.ExtendedOptionFeature1Code.ForeignTaxExempt, com.tools20022.repository.codeset.ExtendedOptionFeature1Code.DRIPUnfavorable,
						com.tools20022.repository.codeset.ExtendedOptionFeature1Code.DRIPFavorable, com.tools20022.repository.codeset.ExtendedOptionFeature1Code.DRIPExempt,
						com.tools20022.repository.codeset.ExtendedOptionFeature1Code.ForeignCurrencyPayment, com.tools20022.repository.codeset.ExtendedOptionFeature1Code.ForeignCurrencyPaymentUnfavorable,
						com.tools20022.repository.codeset.ExtendedOptionFeature1Code.ForeignCurrencyPaymentFavorable, com.tools20022.repository.codeset.ExtendedOptionFeature1Code.ForeignCurrencyPaymentExempt);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ForeignTaxUnfavorable.getCodeName().get(), ForeignTaxUnfavorable);
		codesByName.put(ForeignTaxFavorable.getCodeName().get(), ForeignTaxFavorable);
		codesByName.put(ForeignTaxExempt.getCodeName().get(), ForeignTaxExempt);
		codesByName.put(DRIPUnfavorable.getCodeName().get(), DRIPUnfavorable);
		codesByName.put(DRIPFavorable.getCodeName().get(), DRIPFavorable);
		codesByName.put(DRIPExempt.getCodeName().get(), DRIPExempt);
		codesByName.put(ForeignCurrencyPayment.getCodeName().get(), ForeignCurrencyPayment);
		codesByName.put(ForeignCurrencyPaymentUnfavorable.getCodeName().get(), ForeignCurrencyPaymentUnfavorable);
		codesByName.put(ForeignCurrencyPaymentFavorable.getCodeName().get(), ForeignCurrencyPaymentFavorable);
		codesByName.put(ForeignCurrencyPaymentExempt.getCodeName().get(), ForeignCurrencyPaymentExempt);
	}

	public static ExtendedOptionFeature1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExtendedOptionFeature1Code[] values() {
		ExtendedOptionFeature1Code[] values = new ExtendedOptionFeature1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExtendedOptionFeature1Code> {
		@Override
		public ExtendedOptionFeature1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExtendedOptionFeature1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}