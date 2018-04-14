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
import com.tools20022.repository.codeset.ProcessingType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of processing restrictions the central system must apply.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code#Rejection
 * ProcessingType1Code.Rejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code#CSDValidationHold
 * ProcessingType1Code.CSDValidationHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code#Reservation
 * ProcessingType1Code.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code#Blocking
 * ProcessingType1Code.Blocking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code#Earmarking
 * ProcessingType1Code.Earmarking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code#EarmarkingForAutoCollateralisation
 * ProcessingType1Code.EarmarkingForAutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code#Deliverable
 * ProcessingType1Code.Deliverable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code#Collateralised
 * ProcessingType1Code.Collateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code#CoSDBlocking
 * ProcessingType1Code.CoSDBlocking}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
 * ProcessingTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of processing restrictions the central system must apply."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RJCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProcessingType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code
	 * ProcessingType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingType1Code Rejection = new ProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejection";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingType1Code.mmObject();
			codeName = ProcessingTypeCode.Rejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code
	 * ProcessingType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDValidationHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingType1Code CSDValidationHold = new ProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDValidationHold";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingType1Code.mmObject();
			codeName = ProcessingTypeCode.CSDValidationHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code
	 * ProcessingType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingType1Code Reservation = new ProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingType1Code.mmObject();
			codeName = ProcessingTypeCode.Reservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code
	 * ProcessingType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingType1Code Blocking = new ProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocking";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingType1Code.mmObject();
			codeName = ProcessingTypeCode.Blocking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code
	 * ProcessingType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Earmarking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingType1Code Earmarking = new ProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Earmarking";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingType1Code.mmObject();
			codeName = ProcessingTypeCode.Earmarking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code
	 * ProcessingType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarmarkingForAutoCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingType1Code EarmarkingForAutoCollateralisation = new ProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarmarkingForAutoCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingType1Code.mmObject();
			codeName = ProcessingTypeCode.EarmarkingForAutoCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code
	 * ProcessingType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingType1Code Deliverable = new ProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deliverable";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingType1Code.mmObject();
			codeName = ProcessingTypeCode.Deliverable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code
	 * ProcessingType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingType1Code Collateralised = new ProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateralised";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingType1Code.mmObject();
			codeName = ProcessingTypeCode.Collateralised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingType1Code
	 * ProcessingType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoSDBlocking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingType1Code CoSDBlocking = new ProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoSDBlocking";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingType1Code.mmObject();
			codeName = ProcessingTypeCode.CoSDBlocking.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProcessingType1Code> codesByName = new LinkedHashMap<>();

	protected ProcessingType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RJCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingType1Code";
				definition = "Specifies the type of processing restrictions the central system must apply.";
				trace_lazy = () -> ProcessingTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingType1Code.Rejection, com.tools20022.repository.codeset.ProcessingType1Code.CSDValidationHold,
						com.tools20022.repository.codeset.ProcessingType1Code.Reservation, com.tools20022.repository.codeset.ProcessingType1Code.Blocking, com.tools20022.repository.codeset.ProcessingType1Code.Earmarking,
						com.tools20022.repository.codeset.ProcessingType1Code.EarmarkingForAutoCollateralisation, com.tools20022.repository.codeset.ProcessingType1Code.Deliverable,
						com.tools20022.repository.codeset.ProcessingType1Code.Collateralised, com.tools20022.repository.codeset.ProcessingType1Code.CoSDBlocking);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Rejection.getCodeName().get(), Rejection);
		codesByName.put(CSDValidationHold.getCodeName().get(), CSDValidationHold);
		codesByName.put(Reservation.getCodeName().get(), Reservation);
		codesByName.put(Blocking.getCodeName().get(), Blocking);
		codesByName.put(Earmarking.getCodeName().get(), Earmarking);
		codesByName.put(EarmarkingForAutoCollateralisation.getCodeName().get(), EarmarkingForAutoCollateralisation);
		codesByName.put(Deliverable.getCodeName().get(), Deliverable);
		codesByName.put(Collateralised.getCodeName().get(), Collateralised);
		codesByName.put(CoSDBlocking.getCodeName().get(), CoSDBlocking);
	}

	public static ProcessingType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProcessingType1Code[] values() {
		ProcessingType1Code[] values = new ProcessingType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProcessingType1Code> {
		@Override
		public ProcessingType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProcessingType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}