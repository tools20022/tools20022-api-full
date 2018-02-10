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
import com.tools20022.repository.codeset.SecuritiesBalanceType7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the securities or investment fund balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code#EligibleForCollateralPurposes
 * SecuritiesBalanceType7Code.EligibleForCollateralPurposes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code#Unclassified
 * SecuritiesBalanceType7Code.Unclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code#TaxExempt
 * SecuritiesBalanceType7Code.TaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code#NonTaxExempt
 * SecuritiesBalanceType7Code.NonTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code#Registered
 * SecuritiesBalanceType7Code.Registered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code#StreetPosition
 * SecuritiesBalanceType7Code.StreetPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code#Unregistered
 * SecuritiesBalanceType7Code.Unregistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code#Issued
 * SecuritiesBalanceType7Code.Issued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code#QuasiIssued
 * SecuritiesBalanceType7Code.QuasiIssued}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
 * SecuritiesBalanceTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"COLA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the securities or investment fund balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesBalanceType7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code
	 * SecuritiesBalanceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateralPurposes"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType7Code EligibleForCollateralPurposes = new SecuritiesBalanceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateralPurposes";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType7Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.EligibleForCollateralPurposes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code
	 * SecuritiesBalanceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unclassified"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType7Code Unclassified = new SecuritiesBalanceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType7Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Unclassified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code
	 * SecuritiesBalanceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExempt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType7Code TaxExempt = new SecuritiesBalanceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType7Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.TaxExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code
	 * SecuritiesBalanceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonTaxExempt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType7Code NonTaxExempt = new SecuritiesBalanceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonTaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType7Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.NonTaxExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code
	 * SecuritiesBalanceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType7Code Registered = new SecuritiesBalanceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registered";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType7Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Registered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code
	 * SecuritiesBalanceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPosition"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType7Code StreetPosition = new SecuritiesBalanceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType7Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.StreetPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code
	 * SecuritiesBalanceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unregistered"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType7Code Unregistered = new SecuritiesBalanceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unregistered";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType7Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Unregistered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code
	 * SecuritiesBalanceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issued"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType7Code Issued = new SecuritiesBalanceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issued";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType7Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Issued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType7Code
	 * SecuritiesBalanceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiIssued"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType7Code QuasiIssued = new SecuritiesBalanceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiIssued";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType7Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.QuasiIssued.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesBalanceType7Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesBalanceType7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COLA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceType7Code";
				definition = "Specifies the nature of the securities or investment fund balance.";
				trace_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceType7Code.EligibleForCollateralPurposes, com.tools20022.repository.codeset.SecuritiesBalanceType7Code.Unclassified,
						com.tools20022.repository.codeset.SecuritiesBalanceType7Code.TaxExempt, com.tools20022.repository.codeset.SecuritiesBalanceType7Code.NonTaxExempt,
						com.tools20022.repository.codeset.SecuritiesBalanceType7Code.Registered, com.tools20022.repository.codeset.SecuritiesBalanceType7Code.StreetPosition,
						com.tools20022.repository.codeset.SecuritiesBalanceType7Code.Unregistered, com.tools20022.repository.codeset.SecuritiesBalanceType7Code.Issued,
						com.tools20022.repository.codeset.SecuritiesBalanceType7Code.QuasiIssued);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EligibleForCollateralPurposes.getCodeName().get(), EligibleForCollateralPurposes);
		codesByName.put(Unclassified.getCodeName().get(), Unclassified);
		codesByName.put(TaxExempt.getCodeName().get(), TaxExempt);
		codesByName.put(NonTaxExempt.getCodeName().get(), NonTaxExempt);
		codesByName.put(Registered.getCodeName().get(), Registered);
		codesByName.put(StreetPosition.getCodeName().get(), StreetPosition);
		codesByName.put(Unregistered.getCodeName().get(), Unregistered);
		codesByName.put(Issued.getCodeName().get(), Issued);
		codesByName.put(QuasiIssued.getCodeName().get(), QuasiIssued);
	}

	public static SecuritiesBalanceType7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesBalanceType7Code[] values() {
		SecuritiesBalanceType7Code[] values = new SecuritiesBalanceType7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesBalanceType7Code> {
		@Override
		public SecuritiesBalanceType7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesBalanceType7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}