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
import com.tools20022.repository.codeset.CorporateActionChangeTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of changes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
 * CorporateActionChangeTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmBearToRegistered
 * CorporateActionChangeType1Code.mmBearToRegistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmCertificates
 * CorporateActionChangeType1Code.mmCertificates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmDematerialisedToPhysical
 * CorporateActionChangeType1Code.mmDematerialisedToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmGlobalPermanentToPhysical
 * CorporateActionChangeType1Code.mmGlobalPermanentToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmGlobalTemporaryToGlobalPermanent
 * CorporateActionChangeType1Code.mmGlobalTemporaryToGlobalPermanent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmGlobalTemporaryToPhysical
 * CorporateActionChangeType1Code.mmGlobalTemporaryToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmName
 * CorporateActionChangeType1Code.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmPhysicalToDematerialised
 * CorporateActionChangeType1Code.mmPhysicalToDematerialised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmRegisteredToBearer
 * CorporateActionChangeType1Code.mmRegisteredToBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmTerms
 * CorporateActionChangeType1Code.mmTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code#mmDecimalisation
 * CorporateActionChangeType1Code.mmDecimalisation}</li>
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
 * <li>"BERE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionChangeType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of changes."</li>
 * </ul>
 */
public class CorporateActionChangeType1Code extends CorporateActionChangeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearToRegistered"</li>
	 * </ul>
	 */
	public static final MMCode mmBearToRegistered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BearToRegistered";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificates"</li>
	 * </ul>
	 */
	public static final MMCode mmCertificates = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificates";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedToPhysical"</li>
	 * </ul>
	 */
	public static final MMCode mmDematerialisedToPhysical = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DematerialisedToPhysical";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalPermanentToPhysical"</li>
	 * </ul>
	 */
	public static final MMCode mmGlobalPermanentToPhysical = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalPermanentToPhysical";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalTemporaryToGlobalPermanent"</li>
	 * </ul>
	 */
	public static final MMCode mmGlobalTemporaryToGlobalPermanent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalTemporaryToGlobalPermanent";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalTemporaryToPhysical"</li>
	 * </ul>
	 */
	public static final MMCode mmGlobalTemporaryToPhysical = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalTemporaryToPhysical";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * </ul>
	 */
	public static final MMCode mmName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalToDematerialised"</li>
	 * </ul>
	 */
	public static final MMCode mmPhysicalToDematerialised = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalToDematerialised";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredToBearer"</li>
	 * </ul>
	 */
	public static final MMCode mmRegisteredToBearer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredToBearer";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terms"</li>
	 * </ul>
	 */
	public static final MMCode mmTerms = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Terms";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
	 * CorporateActionChangeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decimalisation"</li>
	 * </ul>
	 */
	public static final MMCode mmDecimalisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decimalisation";
			owner_lazy = () -> CorporateActionChangeType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BERE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionChangeType1Code";
				definition = "Specifies the type of changes.";
				code_lazy = () -> Arrays.asList(CorporateActionChangeType1Code.mmBearToRegistered, CorporateActionChangeType1Code.mmCertificates, CorporateActionChangeType1Code.mmDematerialisedToPhysical,
						CorporateActionChangeType1Code.mmGlobalPermanentToPhysical, CorporateActionChangeType1Code.mmGlobalTemporaryToGlobalPermanent, CorporateActionChangeType1Code.mmGlobalTemporaryToPhysical,
						CorporateActionChangeType1Code.mmName, CorporateActionChangeType1Code.mmPhysicalToDematerialised, CorporateActionChangeType1Code.mmRegisteredToBearer, CorporateActionChangeType1Code.mmTerms,
						CorporateActionChangeType1Code.mmDecimalisation);
				trace_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}