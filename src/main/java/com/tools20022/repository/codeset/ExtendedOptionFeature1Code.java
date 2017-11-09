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
import com.tools20022.repository.codeset.ExtendedOptionFeatureCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) specific
 * options.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
 * ExtendedOptionFeatureCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#mmForeignTaxUnfavorable
 * ExtendedOptionFeature1Code.mmForeignTaxUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#mmForeignTaxFavorable
 * ExtendedOptionFeature1Code.mmForeignTaxFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#mmForeignTaxExempt
 * ExtendedOptionFeature1Code.mmForeignTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#mmDRIPUnfavorable
 * ExtendedOptionFeature1Code.mmDRIPUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#mmDRIPFavorable
 * ExtendedOptionFeature1Code.mmDRIPFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#mmDRIPExempt
 * ExtendedOptionFeature1Code.mmDRIPExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#mmForeignCurrencyPayment
 * ExtendedOptionFeature1Code.mmForeignCurrencyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#mmForeignCurrencyPaymentUnfavorable
 * ExtendedOptionFeature1Code.mmForeignCurrencyPaymentUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#mmForeignCurrencyPaymentFavorable
 * ExtendedOptionFeature1Code.mmForeignCurrencyPaymentFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code#mmForeignCurrencyPaymentExempt
 * ExtendedOptionFeature1Code.mmForeignCurrencyPaymentExempt}</li>
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
 * <li>"FORU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtendedOptionFeature1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) specific options."
 * </li>
 * </ul>
 */
public class ExtendedOptionFeature1Code extends ExtendedOptionFeatureCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxUnfavorable"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignTaxUnfavorable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxUnfavorable";
			owner_lazy = () -> ExtendedOptionFeature1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxFavorable"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignTaxFavorable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxFavorable";
			owner_lazy = () -> ExtendedOptionFeature1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxExempt"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignTaxExempt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxExempt";
			owner_lazy = () -> ExtendedOptionFeature1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPUnfavorable"</li>
	 * </ul>
	 */
	public static final MMCode mmDRIPUnfavorable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPUnfavorable";
			owner_lazy = () -> ExtendedOptionFeature1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPFavorable"</li>
	 * </ul>
	 */
	public static final MMCode mmDRIPFavorable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPFavorable";
			owner_lazy = () -> ExtendedOptionFeature1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPExempt"</li>
	 * </ul>
	 */
	public static final MMCode mmDRIPExempt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPExempt";
			owner_lazy = () -> ExtendedOptionFeature1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignCurrencyPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPayment";
			owner_lazy = () -> ExtendedOptionFeature1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentUnfavorable"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignCurrencyPaymentUnfavorable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentUnfavorable";
			owner_lazy = () -> ExtendedOptionFeature1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentFavorable"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignCurrencyPaymentFavorable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentFavorable";
			owner_lazy = () -> ExtendedOptionFeature1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentExempt"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignCurrencyPaymentExempt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentExempt";
			owner_lazy = () -> ExtendedOptionFeature1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FORU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendedOptionFeature1Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) specific options.";
				code_lazy = () -> Arrays.asList(ExtendedOptionFeature1Code.mmForeignTaxUnfavorable, ExtendedOptionFeature1Code.mmForeignTaxFavorable, ExtendedOptionFeature1Code.mmForeignTaxExempt,
						ExtendedOptionFeature1Code.mmDRIPUnfavorable, ExtendedOptionFeature1Code.mmDRIPFavorable, ExtendedOptionFeature1Code.mmDRIPExempt, ExtendedOptionFeature1Code.mmForeignCurrencyPayment,
						ExtendedOptionFeature1Code.mmForeignCurrencyPaymentUnfavorable, ExtendedOptionFeature1Code.mmForeignCurrencyPaymentFavorable, ExtendedOptionFeature1Code.mmForeignCurrencyPaymentExempt);
				trace_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}