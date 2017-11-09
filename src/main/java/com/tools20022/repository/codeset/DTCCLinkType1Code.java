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
import com.tools20022.repository.codeset.DTCCLinkTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies types of linked events.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
 * DTCCLinkTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmCorrespondingEvent
 * DTCCLinkType1Code.mmCorrespondingEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmDuplicate
 * DTCCLinkType1Code.mmDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmEventChangeToMandatory
 * DTCCLinkType1Code.mmEventChangeToMandatory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmEventChangeToVoluntary
 * DTCCLinkType1Code.mmEventChangeToVoluntary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmFractionalSecurity
 * DTCCLinkType1Code.mmFractionalSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmPartOfHybridSecurity
 * DTCCLinkType1Code.mmPartOfHybridSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmEventOnIntermediarySecurity
 * DTCCLinkType1Code.mmEventOnIntermediarySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmInsuredUninsuredSecurities
 * DTCCLinkType1Code.mmInsuredUninsuredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmEventConvertedToNewEvent
 * DTCCLinkType1Code.mmEventConvertedToNewEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmMultiMarket
 * DTCCLinkType1Code.mmMultiMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#mmOther
 * DTCCLinkType1Code.mmOther}</li>
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
 * <li>"COEV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCLinkType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies types of linked events."</li>
 * </ul>
 */
public class DTCCLinkType1Code extends DTCCLinkTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondingEvent"</li>
	 * </ul>
	 */
	public static final MMCode mmCorrespondingEvent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondingEvent";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplicate"</li>
	 * </ul>
	 */
	public static final MMCode mmDuplicate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duplicate";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventChangeToMandatory"</li>
	 * </ul>
	 */
	public static final MMCode mmEventChangeToMandatory = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventChangeToMandatory";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventChangeToVoluntary"</li>
	 * </ul>
	 */
	public static final MMCode mmEventChangeToVoluntary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventChangeToVoluntary";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalSecurity"</li>
	 * </ul>
	 */
	public static final MMCode mmFractionalSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalSecurity";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartOfHybridSecurity"</li>
	 * </ul>
	 */
	public static final MMCode mmPartOfHybridSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartOfHybridSecurity";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventOnIntermediarySecurity"</li>
	 * </ul>
	 */
	public static final MMCode mmEventOnIntermediarySecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventOnIntermediarySecurity";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredUninsuredSecurities"</li>
	 * </ul>
	 */
	public static final MMCode mmInsuredUninsuredSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuredUninsuredSecurities";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventConvertedToNewEvent"</li>
	 * </ul>
	 */
	public static final MMCode mmEventConvertedToNewEvent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventConvertedToNewEvent";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiMarket"</li>
	 * </ul>
	 */
	public static final MMCode mmMultiMarket = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiMarket";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("COEV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCLinkType1Code";
				definition = "Specifies types of linked events.";
				code_lazy = () -> Arrays.asList(DTCCLinkType1Code.mmCorrespondingEvent, DTCCLinkType1Code.mmDuplicate, DTCCLinkType1Code.mmEventChangeToMandatory, DTCCLinkType1Code.mmEventChangeToVoluntary,
						DTCCLinkType1Code.mmFractionalSecurity, DTCCLinkType1Code.mmPartOfHybridSecurity, DTCCLinkType1Code.mmEventOnIntermediarySecurity, DTCCLinkType1Code.mmInsuredUninsuredSecurities,
						DTCCLinkType1Code.mmEventConvertedToNewEvent, DTCCLinkType1Code.mmMultiMarket, DTCCLinkType1Code.mmOther);
				trace_lazy = () -> DTCCLinkTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}