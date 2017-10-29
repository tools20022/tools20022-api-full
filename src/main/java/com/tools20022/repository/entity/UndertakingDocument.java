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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.DocumentFormat1Choice;
import com.tools20022.repository.choice.PresentationDocumentFormat1Choice;
import com.tools20022.repository.choice.UndertakingDocumentType1Choice;
import com.tools20022.repository.choice.UndertakingDocumentType2Choice;
import com.tools20022.repository.codeset.ExternalDocumentFormatCode;
import com.tools20022.repository.codeset.ExternalUndertakingDocumentTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.FinancialDocument;
import com.tools20022.repository.msg.Document10;
import com.tools20022.repository.msg.Document11;
import com.tools20022.repository.msg.Document8;
import com.tools20022.repository.msg.Document9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document presented.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingDocument" src="doc-files/UndertakingDocument.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#DocumentType
 * UndertakingDocument.DocumentType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingDocument#Format
 * UndertakingDocument.Format}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#Undertaking
 * UndertakingDocument.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#CopyIndicator
 * UndertakingDocument.CopyIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingDocument#Demand
 * UndertakingDocument.Demand}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#SpecifiedDocument
 * Undertaking.SpecifiedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#AssociatedDocument
 * Demand.AssociatedDocument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Document9#Enclosure
 * Document9.Enclosure}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#EnclosedFile
 * ExtendOrPayQuery1.EnclosedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandDocumentation1#EnclosedFile
 * DemandDocumentation1.EnclosedFile}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.FinancialDocument
 * FinancialDocument}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UndertakingDocumentType1Choice
 * UndertakingDocumentType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DocumentFormat1Choice
 * DocumentFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Document9 Document9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PresentationDocumentFormat1Choice
 * PresentationDocumentFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Document11 Document11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UndertakingDocumentType2Choice
 * UndertakingDocumentType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Document10 Document10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Document8 Document8}</li>
 * </ul>
 * </li>
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
 * "UndertakingDocument"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Document presented."</li>
 * </ul>
 */
public class UndertakingDocument extends FinancialDocument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalUndertakingDocumentTypeCode
	 * ExternalUndertakingDocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UndertakingDocumentType1Choice#Code
	 * UndertakingDocumentType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UndertakingDocumentType1Choice#Proprietary
	 * UndertakingDocumentType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Document9#Type
	 * Document9.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UndertakingDocumentType2Choice#Code
	 * UndertakingDocumentType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UndertakingDocumentType2Choice#Proprietary
	 * UndertakingDocumentType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Document10#DocumentType
	 * Document10.DocumentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Document8#Type
	 * Document8.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DocumentType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UndertakingDocumentType1Choice.Code, com.tools20022.repository.choice.UndertakingDocumentType1Choice.Proprietary,
					com.tools20022.repository.msg.Document9.Type, com.tools20022.repository.choice.UndertakingDocumentType2Choice.Code, com.tools20022.repository.choice.UndertakingDocumentType2Choice.Proprietary,
					com.tools20022.repository.msg.Document10.DocumentType, com.tools20022.repository.msg.Document8.Type);
			elementContext_lazy = () -> UndertakingDocument.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentType";
			definition = "Type of document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingDocumentTypeCode.mmObject();
		}
	};
	/**
	 * Format of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentFormatCode
	 * ExternalDocumentFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentFormat1Choice#Code
	 * DocumentFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentFormat1Choice#Proprietary
	 * DocumentFormat1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Document9#Format
	 * Document9.Format}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PresentationDocumentFormat1Choice#Code
	 * PresentationDocumentFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PresentationDocumentFormat1Choice#Proprietary
	 * PresentationDocumentFormat1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation3#Format
	 * Presentation3.Format}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Document11#Type
	 * Document11.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Document10#DocumentFormat
	 * Document10.DocumentFormat}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Format"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Format = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DocumentFormat1Choice.Code, com.tools20022.repository.choice.DocumentFormat1Choice.Proprietary, com.tools20022.repository.msg.Document9.Format,
					com.tools20022.repository.choice.PresentationDocumentFormat1Choice.Code, com.tools20022.repository.choice.PresentationDocumentFormat1Choice.Proprietary, com.tools20022.repository.msg.Presentation3.Format,
					com.tools20022.repository.msg.Document11.Type, com.tools20022.repository.msg.Document10.DocumentFormat);
			elementContext_lazy = () -> UndertakingDocument.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Format";
			definition = "Format of the document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentFormatCode.mmObject();
		}
	};
	/**
	 * Undertaking for which document content is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#SpecifiedDocument
	 * Undertaking.SpecifiedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which document content is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> UndertakingDocument.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which document content is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.SpecifiedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the document is a copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Document10#CopyIndicator
	 * Document10.CopyIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the document is a copy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CopyIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Document10.CopyIndicator);
			elementContext_lazy = () -> UndertakingDocument.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CopyIndicator";
			definition = "Indicates whether the document is a copy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Demand for which associated documents are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Demand#AssociatedDocument
	 * Demand.AssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Demand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Demand for which associated documents are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Demand = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> UndertakingDocument.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Demand";
			definition = "Demand for which associated documents are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.AssociatedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingDocument";
				definition = "Document presented.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.SpecifiedDocument, com.tools20022.repository.entity.Demand.AssociatedDocument);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Document9.Enclosure, com.tools20022.repository.msg.ExtendOrPayQuery1.EnclosedFile, com.tools20022.repository.msg.DemandDocumentation1.EnclosedFile);
				superType_lazy = () -> FinancialDocument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingDocument.DocumentType, com.tools20022.repository.entity.UndertakingDocument.Format,
						com.tools20022.repository.entity.UndertakingDocument.Undertaking, com.tools20022.repository.entity.UndertakingDocument.CopyIndicator, com.tools20022.repository.entity.UndertakingDocument.Demand);
				derivationComponent_lazy = () -> Arrays.asList(UndertakingDocumentType1Choice.mmObject(), DocumentFormat1Choice.mmObject(), Document9.mmObject(), PresentationDocumentFormat1Choice.mmObject(), Document11.mmObject(),
						UndertakingDocumentType2Choice.mmObject(), Document10.mmObject(), Document8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}